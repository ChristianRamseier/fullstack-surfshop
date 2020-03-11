package com.surfshop.reservation

import com.surfshop.inventory.service.InventoryServiceApi
import com.surfshop.reservation.dto.ReservationDto
import com.surfshop.reservation.dto.ReservedBoardDto
import com.surfshop.reservation.dto.ReservedSailDto
import com.surfshop.reservation.service.ReservationServiceApi
import org.springframework.web.bind.annotation.RestController

@RestController
class ReservationController(val reservationService: ReservationServiceApi, val inventoryService: InventoryServiceApi) : ReservationApi {

    override fun getReservations(): List<ReservationDto> {
        val reservations = reservationService.getReservations()
        val boards = inventoryService.getBoards().associateBy { it.id }
        val sails = inventoryService.getSails().associateBy { it.id }
        return reservations.map {
            val board = boards[it.boardId]!!
            val sail = sails[it.sailId]!!
            ReservationDto(it.date, it.id, ReservedBoardDto(
                    id = board.id,
                    brand = board.brand,
                    model = board.model,
                    volume = board.volume
            ), ReservedSailDto(
                    id = sail.id,
                    brand = sail.brand,
                    model = sail.model,
                    size = sail.size
            ))
        }
    }

}
