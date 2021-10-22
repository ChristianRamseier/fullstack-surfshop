package com.surfshop.reservation.dto

import com.surfshop.common.ReservationId
import java.time.LocalDate

data class ReservationDto(
        val date: LocalDate,
        val id: ReservationId,
        val board: ReservedBoardDto,
        val sail: ReservedSailDto,
        val customer: CustomerDto

) {

}
