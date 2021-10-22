package com.surfshop.inventory.service.db

import org.jmolecules.ddd.annotation.AggregateRoot
import org.jmolecules.ddd.annotation.Identity
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@AggregateRoot
@Entity
@Table(name = "Board")
data class BoardEntity(
        @Identity
        @Id
        val id: Long,
        val brand: String,
        val model: String,
        val volume: Double
) {
}
