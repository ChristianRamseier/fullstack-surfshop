package com.surfshop.inventory.dto

import com.surfshop.common.SailId
import com.surfshop.common.SquareMeters

data class SailDto(
        val id: SailId,
        val brand: String,
        val model: String,
        val size: SquareMeters
) {

}
