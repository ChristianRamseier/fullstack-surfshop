package com.surfshop.customer.service.db

import org.jmolecules.ddd.annotation.AggregateRoot
import org.jmolecules.ddd.annotation.Identity
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@AggregateRoot
@Entity
@Table(name = "Customer")
data class CustomerEntity(
        @Identity
        @Id
        val id: Long,
        val firstname: String,
        val lastname: String
) {
}
