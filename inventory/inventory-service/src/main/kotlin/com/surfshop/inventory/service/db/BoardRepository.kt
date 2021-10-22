package com.surfshop.inventory.service.db

import com.surfshop.common.BoardId
import com.surfshop.common.SailId
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@org.jmolecules.ddd.annotation.Repository
@Repository
interface BoardRepository : CrudRepository<BoardEntity, BoardId> {

}
