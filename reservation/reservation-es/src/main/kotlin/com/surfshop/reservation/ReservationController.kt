package com.surfshop.reservation

import com.surfshop.reservation.dto.ReservationDto
import com.surfshop.service.reservation.ReservationServiceApi
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RestController

@RestController
class ReservationController(val reservationService: ReservationServiceApi) : ReservationApi {

    override fun getReservations(): List<ReservationDto> {
        val reservations = reservationService.getReservations()
        return reservations.map {
            ReservationDto(it.date, it.id, it.rigId)
        }
    }

}
