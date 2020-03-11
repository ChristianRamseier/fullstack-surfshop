package com.surfshop.inventory

import com.surfshop.inventory.dto.BoardDto
import com.surfshop.inventory.dto.SailDto
import com.surfshop.inventory.service.InventoryServiceApi
import org.springframework.web.bind.annotation.RestController

@RestController
class InventoryController(val inventoryService: InventoryServiceApi) : InventoryApi {

    override fun getBoards(): List<BoardDto> {
        return inventoryService.getBoards().map {
            BoardDto(it.id, it.brand, it.model, it.volume)
        }
    }

    override fun getSails(): List<SailDto> {
        return inventoryService.getSails().map {
            SailDto(it.id, it.brand, it.model, it.size)
        }
    }


}
