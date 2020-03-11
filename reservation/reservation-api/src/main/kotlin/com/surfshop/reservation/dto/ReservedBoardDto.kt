package com.surfshop.reservation.dto

import com.surfshop.common.BoardId
import com.surfshop.common.Liters

class ReservedBoardDto(
        val id: BoardId,
        val brand: String,
        val model: String,
        val volume: Liters
) {

}
