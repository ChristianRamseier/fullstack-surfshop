package com.surfshop.reservation.service.dto

import com.surfshop.common.CustomerId
import com.surfshop.common.ReservationId
import com.surfshop.common.BoardId
import com.surfshop.common.SailId
import java.time.LocalDate

data class ReservationDto(
        val date: LocalDate,
        val id: ReservationId,
        val customerId: CustomerId,
        val boardId: BoardId,
        val sailId: SailId
) {

}
