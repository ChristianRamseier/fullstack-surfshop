package com.surfshop.customer.service.db

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "Customer")
data class CustomerEntity(
        @Id
        val id: Long,
        val firstname: String,
        val lastname: String
) {
}
