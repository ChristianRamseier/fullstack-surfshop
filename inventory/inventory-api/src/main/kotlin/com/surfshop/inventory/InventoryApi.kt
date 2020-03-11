package com.surfshop.inventory

import com.surfshop.inventory.dto.BoardDto
import com.surfshop.inventory.dto.SailDto
import org.springframework.web.bind.annotation.GetMapping

interface InventoryApi {

    @GetMapping("/inventory/board")
    fun getBoards(): List<BoardDto>

    @GetMapping("/inventory/sail")
    fun getSails(): List<SailDto>

}
