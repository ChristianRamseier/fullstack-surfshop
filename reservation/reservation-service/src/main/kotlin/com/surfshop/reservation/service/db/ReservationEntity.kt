package com.surfshop.reservation.service.db

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "Reservation")
data class ReservationEntity(
        @Id
        val id: Long,
        val date: LocalDate,
        val customer: Long,
        val board: Long,
        val sail: Long
) {
}
