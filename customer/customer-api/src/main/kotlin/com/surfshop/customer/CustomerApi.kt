package com.surfshop.customer

import com.surfshop.customer.dto.CustomerDto
import org.springframework.web.bind.annotation.GetMapping

interface CustomerApi {

    @GetMapping("/customer")
    fun getCustomers(): List<CustomerDto>


}
