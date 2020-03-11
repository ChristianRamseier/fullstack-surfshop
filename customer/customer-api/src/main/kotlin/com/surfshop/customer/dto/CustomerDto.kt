package com.surfshop.customer.dto

import com.surfshop.common.CustomerId

data class CustomerDto(
        val id: CustomerId,
        val firstname: String,
        val lastname: String
) {

}
