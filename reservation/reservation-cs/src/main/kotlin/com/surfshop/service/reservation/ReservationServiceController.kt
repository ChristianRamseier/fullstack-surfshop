package com.surfshop.service.reservation

import com.surfshop.common.CustomerId
import com.surfshop.common.ReservationId
import com.surfshop.common.RigId
import com.surfshop.service.reservation.dto.ReservationDto
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
class ReservationServiceController : ReservationServiceApi {

    override fun getReservations(): List<ReservationDto> {
        val reservation = ReservationDto(
                LocalDate.of(2020, 3, 5),
                ReservationId("r"),
                CustomerId("b"),
                RigId("4")
        )
        return listOf(reservation)
    }

}
