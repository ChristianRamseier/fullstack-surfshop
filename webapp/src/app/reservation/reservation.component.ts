import {Component, OnInit} from '@angular/core';
import {ReservationService} from "./service/reservation.service";
import {ReservationDto} from "./service/reservation-dto";

@Component({
  selector: 'app-reservation',
  templateUrl: './reservation.component.html',
  styleUrls: ['./reservation.component.scss']
})
export class ReservationComponent implements OnInit {

  reservations: ReservationDto[] = [];

  constructor(private reservationService: ReservationService) { }

  ngOnInit(): void {
    this.reservationService.getReservations().subscribe(reservations => {
      this.reservations = reservations;
    })
  }

}
