package com.surfshop.service.waterlevel.dto

import com.surfshop.common.Direction
import com.surfshop.common.Speed
import com.surfshop.common.redis.RedisTopic

data class WindDto(val direction: Direction, val speed: Speed) {

    companion object {
        val TOPIC = RedisTopic<WindDto>("wind")
    }
}
