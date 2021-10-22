package com.surfshop.customer.service.db

import com.surfshop.common.CustomerId
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@org.jmolecules.ddd.annotation.Repository
@Repository
interface CustomerRepository : CrudRepository<CustomerEntity, CustomerId> {

}
