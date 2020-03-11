import {Component, OnInit} from '@angular/core';
import {CustomerService} from './service/customer.service';
import {CustomerDto} from './service/dto/customer-dto';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.scss']
})
export class CustomerComponent implements OnInit {

  customers: CustomerDto[];

  constructor(private customerService: CustomerService) {
  }

  ngOnInit(): void {
    this.customerService.getCustomer().subscribe(customers => {
      this.customers = customers;
    });
  }

}
