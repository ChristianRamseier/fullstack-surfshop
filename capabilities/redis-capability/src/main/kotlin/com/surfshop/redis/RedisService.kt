package com.surfshop.redis

import com.fasterxml.jackson.databind.ObjectMapper
import com.surfshop.common.redis.RedisTopic
import org.springframework.data.redis.connection.MessageListener
import org.springframework.data.redis.connection.Subscription
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.data.redis.listener.ChannelTopic
import org.springframework.data.redis.listener.RedisMessageListenerContainer
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer
import org.springframework.stereotype.Service

@Service
final class RedisService(
        val redisTemplate: RedisTemplate<Any, Any>,
        val redisContainer:  RedisMessageListenerContainer,
        val objectMapper: ObjectMapper
) {

    fun <T> publish(topic: RedisTopic<T>, message: T) {
        println("publish $message")
        redisTemplate.convertAndSend(topic.name, message as Any)
    }

    inline fun <reified T> onMessage(topic: RedisTopic<T>, crossinline listener: (T) -> Unit) : RedisSubscription {
        val l = MessageListener { message, _ ->
            val deserializedMessage: T? = GenericJackson2JsonRedisSerializer(objectMapper).deserialize(message.body, T::class.java)
            if (deserializedMessage != null) {
                println("receive ${deserializedMessage}")
                listener(deserializedMessage)
            } else {
                throw RuntimeException("Unable to deserialize '${message.body}' to ${T::class.qualifiedName}")
            }
        }
        redisContainer.addMessageListener(l, ChannelTopic(topic.name))
        return object : RedisSubscription {
            override fun unsubscribe() {
                redisContainer.removeMessageListener(l)
            }
        }
    }

}
