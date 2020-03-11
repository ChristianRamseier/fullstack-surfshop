import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {CustomerDto} from './dto/customer-dto';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private httpClient: HttpClient) { }

  getCustomer(): Observable<CustomerDto[]> {
    return this.httpClient.get('/api/customer') as Observable<CustomerDto[]>;
  }

}
