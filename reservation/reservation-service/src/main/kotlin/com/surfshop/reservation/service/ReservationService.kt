package com.surfshop.reservation.service

import com.surfshop.common.BoardId
import com.surfshop.common.CustomerId
import com.surfshop.common.ReservationId
import com.surfshop.common.SailId
import com.surfshop.reservation.service.db.ReservationRepository
import com.surfshop.reservation.service.dto.ReservationDto
import org.springframework.stereotype.Service

@Service
class ReservationService(val reservationRepository: ReservationRepository) : ReservationServiceApi {

    override fun getReservations(): List<ReservationDto> {
        val reservations = reservationRepository.findAll()
        return reservations.map {
                    ReservationDto(
                            it.date,
                            ReservationId(it.id),
                            CustomerId(it.customer),
                            BoardId(it.board),
                            SailId(it.sail)
                    )
                }
    }

}
