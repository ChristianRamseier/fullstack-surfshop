package com.surfshop.reservation.dto

import com.surfshop.common.SailId
import com.surfshop.common.SquareMeters

class ReservedSailDto(
        val id: SailId,
        val brand: String,
        val model: String,
        val size: SquareMeters
) {

}
