package com.surfshop.service.reservation

import com.surfshop.service.waterlevel.dto.WindDto


interface WindServiceApi {

    fun getWind(): WindDto

}
