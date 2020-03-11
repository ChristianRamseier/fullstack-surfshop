package com.surfshop

import com.surfshop.common.CommonDomainSerialization
import com.surfshop.deserializer.CustomDoubleDeserializer
import com.surfshop.deserializer.CustomLongDeserializer
import com.surfshop.deserializer.CustomStringDeserializer
import com.surfshop.serializer.CustomDoubleSerializer
import com.surfshop.serializer.CustomLongSerializer
import com.surfshop.serializer.CustomStringSerializer
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder


@Configuration
class JacksonConfiguration {

    @Bean
    fun customJson(): Jackson2ObjectMapperBuilderCustomizer {
        return Jackson2ObjectMapperBuilderCustomizer { builder: Jackson2ObjectMapperBuilder ->
            builder.indentOutput(true)
            val doubleDeserializers = CommonDomainSerialization.doubleSerializationInfo.map { CustomDoubleDeserializer(it.clazz, it.deserializationFunction) }
            val stringDeserializers  = CommonDomainSerialization.stringSerializationInfo.map { CustomStringDeserializer(it.clazz, it.deserializationFunction) }
            val longDeserializers  = CommonDomainSerialization.longSerializationInfo.map { CustomLongDeserializer(it.clazz, it.deserializationFunction) }
            val deserializers = doubleDeserializers + stringDeserializers + longDeserializers
            builder.deserializers(*deserializers.toTypedArray())

            val doubleSerializers = CommonDomainSerialization.doubleSerializationInfo.map { CustomDoubleSerializer(it.clazz, it.serializerFunction) }
            val stringSerializers = CommonDomainSerialization.stringSerializationInfo.map { CustomStringSerializer(it.clazz, it.serializerFunction) }
            val longSerializers  = CommonDomainSerialization.longSerializationInfo.map { CustomLongSerializer(it.clazz, it.serializerFunction) }
            val serializers = doubleSerializers + stringSerializers + longSerializers
            builder.serializers(*serializers.toTypedArray())
        }
    }
}
