package com.surfshop.reservation.service

import com.surfshop.common.CustomerId
import com.surfshop.common.ReservationId
import com.surfshop.common.BoardId
import com.surfshop.common.SailId
import com.surfshop.reservation.service.dto.ReservationDto
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
class ReservationService : ReservationServiceApi {

    override fun getReservations(): List<ReservationDto> {
        val reservation = ReservationDto(
                LocalDate.of(2020, 3, 5),
                ReservationId("reservation-1"),
                CustomerId("customer-1"),
                BoardId("naish-1"),
                SailId("naish-1")
        )
        return listOf(reservation)
    }

}
