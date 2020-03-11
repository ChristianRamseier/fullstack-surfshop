package com.surfshop.inventory.service.dto

import com.surfshop.common.BoardId
import com.surfshop.common.Liters
import com.surfshop.common.SailId
import com.surfshop.common.SquareMeters

data class SailDto(
        val id: SailId,
        val brand: String,
        val model: String,
        val size: SquareMeters
) {

}
