package com.surfshop.customer.service.dto

import com.surfshop.common.*

data class CustomerDto(
        val id: CustomerId,
        val firstname: String,
        val lastname: String
) {

}
