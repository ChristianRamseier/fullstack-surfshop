package com.surfshop.reservation.service

import com.surfshop.reservation.service.dto.ReservationDto

interface ReservationServiceApi {

    fun getReservations(): List<ReservationDto>

}
