package com.surfshop.inventory.service.db

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "Sail")
data class SailEntity(
        @Id
        val id: Long,
        val brand: String,
        val model: String,
        val size: Double
) {
}
