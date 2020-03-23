package com.surfshop.inventory.service

import com.surfshop.common.BoardId
import com.surfshop.common.Liters
import com.surfshop.common.SailId
import com.surfshop.common.SquareMeters
import com.surfshop.inventory.service.db.BoardRepository
import com.surfshop.inventory.service.db.SailRepository
import com.surfshop.inventory.service.dto.BoardDto
import com.surfshop.inventory.service.dto.SailDto
import org.springframework.stereotype.Service

@Service
class InventoryService(val boardRepository: BoardRepository, val sailRepository: SailRepository) : InventoryServiceApi {

    override fun getBoards(): List<BoardDto> {
        return boardRepository.findAll().map {
            BoardDto(
                    id = BoardId(it.id),
                    brand = it.brand,
                    model = it.model,
                    volume = Liters(it.volume))
        }
    }

    override fun getSails(): List<SailDto> {
        return sailRepository.findAll().map {
            SailDto(
                    id = SailId(it.id),
                    brand = it.brand,
                    model = it.model,
                    size = SquareMeters(it.size))
        }
    }

}
