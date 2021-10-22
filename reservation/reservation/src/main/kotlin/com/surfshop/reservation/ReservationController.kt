package com.surfshop.reservation

import com.surfshop.customer.service.CustomerServiceApi
import com.surfshop.inventory.service.InventoryServiceApi
import com.surfshop.reservation.dto.CustomerDto
import com.surfshop.reservation.dto.ReservationDto
import com.surfshop.reservation.dto.ReservedBoardDto
import com.surfshop.reservation.dto.ReservedSailDto
import com.surfshop.reservation.service.ReservationServiceApi
import org.springframework.web.bind.annotation.RestController

@RestController
class ReservationController(val reservationService: ReservationServiceApi, val inventoryService: InventoryServiceApi, val customerService: CustomerServiceApi) : ReservationApi {

    override fun getReservations(): List<ReservationDto> {
        val reservations = reservationService.getReservations()
        val boards = inventoryService.getBoards().associateBy { it.id }
        val sails = inventoryService.getSails().associateBy { it.id }
        val customers = customerService.getCustomers().associateBy { it.id }
        return reservations.map {
            val board = boards[it.boardId]!!
            val sail = sails[it.sailId]!!
            val customer = customers[it.customerId]!!
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
            ), CustomerDto(
                    id = customer.id,
                    firstname = customer.firstname,
                    lastname = customer.lastname
            )
            )
        }
    }

}
