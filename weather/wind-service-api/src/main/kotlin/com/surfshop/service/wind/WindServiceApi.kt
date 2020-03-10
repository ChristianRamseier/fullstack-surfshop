package com.surfshop.service.wind

import com.surfshop.service.waterlevel.dto.WindDto
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name="wind", url="http://localhost:8081/")
interface WindServiceApi {

    @GetMapping("/weather/wind")
    fun getWind(): WindDto

}
