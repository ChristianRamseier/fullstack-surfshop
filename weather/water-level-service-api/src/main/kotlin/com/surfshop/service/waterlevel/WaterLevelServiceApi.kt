package com.surfshop.service.reservation

import com.surfshop.service.waterlevel.dto.WaterLevelDto


interface WaterLevelServiceApi {

    fun getWaterLevel(): WaterLevelDto

}
