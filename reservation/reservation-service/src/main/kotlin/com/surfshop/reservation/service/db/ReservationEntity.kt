package com.surfshop.reservation.service.db

import org.jmolecules.ddd.annotation.AggregateRoot
import org.jmolecules.ddd.annotation.Identity
import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@AggregateRoot
@Entity
@Table(name = "Reservation")
data class ReservationEntity(
        @Identity
        @Id
        val id: Long,
        val date: LocalDate,
        val customer: Long,
        val board: Long,
        val sail: Long
) {
}
