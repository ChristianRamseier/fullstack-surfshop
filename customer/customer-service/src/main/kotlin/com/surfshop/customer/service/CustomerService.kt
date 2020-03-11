package com.surfshop.customer.service

import com.surfshop.common.CustomerId
import com.surfshop.customer.service.dto.CustomerDto
import org.springframework.stereotype.Service

@Service
class CustomerService : CustomerServiceApi {

    override fun getCustomers(): List<CustomerDto> {
        return listOf(
                CustomerDto(
                        id = CustomerId("customer-1"),
                        firstname = "Regina",
                        lastname = "Arnold"
                ),
                CustomerDto(
                        id = CustomerId("customer-2"),
                        firstname = "Samuel",
                        lastname = "Felipe"
                ),
                CustomerDto(
                        id = CustomerId("customer-3"),
                        firstname = "Robin",
                        lastname = "Kieler"
                )
        )
    }


}
