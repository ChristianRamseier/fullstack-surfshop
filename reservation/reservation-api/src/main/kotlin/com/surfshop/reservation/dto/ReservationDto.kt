package com.surfshop.reservation.dto

import com.surfshop.common.ReservationId
import com.surfshop.common.RigId
import java.time.LocalDate

data class ReservationDto(
        val date: LocalDate,
        val id: ReservationId,
        val rigId: RigId
) {

}
