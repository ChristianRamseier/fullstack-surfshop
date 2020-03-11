package com.surfshop.inventory.service

import com.surfshop.inventory.service.dto.BoardDto
import com.surfshop.inventory.service.dto.SailDto

interface InventoryServiceApi {

    fun getBoards(): List<BoardDto>

    fun getSails(): List<SailDto>

}
