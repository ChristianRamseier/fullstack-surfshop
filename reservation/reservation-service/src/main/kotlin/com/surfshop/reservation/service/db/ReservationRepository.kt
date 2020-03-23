package com.surfshop.reservation.service.db

import com.surfshop.common.ReservationId
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ReservationRepository : CrudRepository<ReservationEntity, ReservationId> {

}
