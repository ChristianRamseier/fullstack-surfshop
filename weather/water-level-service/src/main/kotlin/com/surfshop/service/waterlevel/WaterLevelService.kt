package com.surfshop.service.waterlevel

import com.surfshop.common.Meters
import com.surfshop.service.waterlevel.dto.WaterLevelDto
import org.springframework.web.bind.annotation.RestController

@RestController
class WaterLevelService : WaterLevelServiceApi {

    override fun getWaterLevel(): WaterLevelDto {
        return WaterLevelDto(Meters(2.0))
    }

}
