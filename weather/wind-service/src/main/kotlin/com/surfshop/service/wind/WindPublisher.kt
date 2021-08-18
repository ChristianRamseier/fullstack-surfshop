package com.surfshop.service.wind

import com.surfshop.common.Direction
import com.surfshop.common.Speed
import com.surfshop.redis.RedisService
import com.surfshop.service.waterlevel.dto.WindDto
import org.springframework.stereotype.Service
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import javax.annotation.PostConstruct

@Service
class WindPublisher(val redisService: RedisService) {

    @PostConstruct
    fun publish() {
        Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate({
            redisService.publish(WindDto.TOPIC, WindDto(Direction.values().random(), Speed((1L..7L).random())))
        }, 1, 1, TimeUnit.SECONDS)

    }

}
