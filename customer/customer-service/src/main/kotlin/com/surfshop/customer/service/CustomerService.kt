package com.surfshop.customer.service

import com.surfshop.common.CustomerId
import com.surfshop.customer.service.db.CustomerRepository
import com.surfshop.customer.service.dto.CustomerDto
import org.springframework.stereotype.Service

@Service
class CustomerService(val customerRepository: CustomerRepository) : CustomerServiceApi {

    override fun getCustomers(): List<CustomerDto> {
        return customerRepository.findAll()
                .map {
                    CustomerDto(
                            id = CustomerId(it.id),
                            firstname = it.firstname,
                            lastname = it.lastname
                    )
                }
    }
}
