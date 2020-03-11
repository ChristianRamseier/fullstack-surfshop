package com.surfshop.inventory.service.dto

import com.surfshop.common.BoardId
import com.surfshop.common.Liters

data class BoardDto(
        val id: BoardId,
        val brand: String,
        val model: String,
        val volume: Liters
) {

}
