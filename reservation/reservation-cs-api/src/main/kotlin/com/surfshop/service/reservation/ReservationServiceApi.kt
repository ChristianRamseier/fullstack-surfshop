package com.surfshop.service.reservation

import com.surfshop.service.reservation.dto.ReservationDto

interface ReservationServiceApi {

    fun getReservations(): List<ReservationDto>

}
