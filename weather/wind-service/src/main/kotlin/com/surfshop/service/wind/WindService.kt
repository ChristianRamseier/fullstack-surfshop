package com.surfshop.service.wind

import com.surfshop.common.Direction
import com.surfshop.common.Speed
import com.surfshop.service.waterlevel.dto.WindDto
import org.springframework.web.bind.annotation.RestController

@RestController
class WindService : WindServiceApi {
    override fun getWind(): WindDto {
        return WindDto(Direction.SE, Speed(4))
    }
}
