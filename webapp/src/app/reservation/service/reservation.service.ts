import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {ReservationDto} from "./dto/reservation-dto";

@Injectable({
  providedIn: 'root'
})
export class ReservationService {

  constructor(private httpClient: HttpClient) { }

  getReservations(): Observable<ReservationDto[]> {
    return this.httpClient.get('/api/reservation') as Observable<ReservationDto[]>;
  }
}
