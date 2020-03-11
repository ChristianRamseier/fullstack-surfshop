package com.surfshop.reservation.service

import com.surfshop.common.BoardId
import com.surfshop.common.Liters
import com.surfshop.common.SailId
import com.surfshop.common.SquareMeters
import com.surfshop.inventory.service.InventoryServiceApi
import com.surfshop.inventory.service.dto.BoardDto
import com.surfshop.inventory.service.dto.SailDto
import org.springframework.stereotype.Service

@Service
class InventoryService : InventoryServiceApi {

    override fun getBoards(): List<BoardDto> {
        return listOf(
                BoardDto(
                        id = BoardId("naish-1"),
                        brand = "Naish",
                        model = "Starship",
                        volume = Liters(120.0)
                ),
                BoardDto(
                        id = BoardId("naish-2"),
                        brand = "Naish",
                        model = "Galaxy",
                        volume = Liters(130.0)
                ),
                BoardDto(
                        id = BoardId("fanatic-1"),
                        brand = "Fanatic",
                        model = "Freewave",
                        volume = Liters(130.0)
                ),
                BoardDto(
                        id = BoardId("fanatic-2"),
                        brand = "Fanatic",
                        model = "Gecko",
                        volume = Liters(145.0)
                )
        )
    }

    override fun getSails(): List<SailDto> {
        return listOf(
                SailDto(
                        id = SailId("naish-1"),
                        brand = "Naish",
                        model = "Lift",
                        size = SquareMeters(5.0)
                ),
                SailDto(
                        id = SailId("naish-2"),
                        brand = "Naish",
                        model = "Force 5",
                        size = SquareMeters(6.5)
                ),
                SailDto(
                        id = SailId("mistral-1"),
                        brand = "Mistral",
                        model = "Zonda",
                        size = SquareMeters(4.5)
                ),
                SailDto(
                        id = SailId("mistral-2"),
                        brand = "Mistral",
                        model = "Zonda",
                        size = SquareMeters(4.0)
                )
        )
    }

}
