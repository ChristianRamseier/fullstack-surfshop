package com.surfshop.inventory.service.db

import com.surfshop.common.SailId
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@org.jmolecules.ddd.annotation.Repository
@Repository
interface SailRepository : CrudRepository<SailEntity, SailId> {

}
