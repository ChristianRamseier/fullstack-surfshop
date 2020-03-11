package com.surfshop.reservation.dto

import com.surfshop.common.ReservationId
import com.surfshop.common.BoardId
import java.time.LocalDate

data class ReservationDto(
        val date: LocalDate,
        val id: ReservationId,
        val board: ReservedBoardDto,
        val sail: ReservedSailDto

) {

}
