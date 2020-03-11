package com.surfshop.customer.service

import com.surfshop.customer.service.dto.CustomerDto


interface CustomerServiceApi {

    fun getCustomers(): List<CustomerDto>

}
