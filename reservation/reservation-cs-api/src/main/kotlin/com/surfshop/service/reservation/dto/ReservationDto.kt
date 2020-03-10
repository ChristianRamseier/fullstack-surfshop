package com.surfshop.service.reservation.dto

import com.surfshop.common.CustomerId
import com.surfshop.common.ReservationId
import com.surfshop.common.RigId
import java.time.LocalDate

data class ReservationDto(
        val date: LocalDate,
        val id: ReservationId,
        val customerId: CustomerId,
        val rigId: RigId
) {

}
