package com.surfshop.service.waterlevel

import com.surfshop.service.waterlevel.dto.WaterLevelDto
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name="water-level", url="http://localhost:8081/")
interface WaterLevelServiceApi {

    @GetMapping("/weather/water-level")
    fun getWaterLevel(): WaterLevelDto

}
