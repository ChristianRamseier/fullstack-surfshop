package com.surfshop.reservation

import com.surfshop.reservation.dto.ReservationDto
import org.springframework.web.bind.annotation.GetMapping

interface ReservationApi {

    @GetMapping("/reservation")
    fun getReservations(): List<ReservationDto>

}
