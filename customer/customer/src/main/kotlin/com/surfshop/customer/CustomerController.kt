package com.surfshop.customer

import com.surfshop.customer.dto.CustomerDto
import com.surfshop.customer.service.CustomerServiceApi
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController(val customerService: CustomerServiceApi) : CustomerApi {

    override fun getCustomers(): List<CustomerDto> {
        return customerService.getCustomers().map {
            CustomerDto(
                    id = it.id,
                    firstname = it.firstname,
                    lastname = it.lastname
            )
        }
    }

}
