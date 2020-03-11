import { Component, OnInit } from '@angular/core';
import {ReservationDto} from '../reservation/service/dto/reservation-dto';
import {ReservationService} from '../reservation/service/reservation.service';
import {SailDto} from './service/dto/sail-dto';
import {BoardDto} from './service/dto/board-dto';
import {InventoryService} from './service/inventory.service';

@Component({
  selector: 'app-inventory',
  templateUrl: './inventory.component.html',
  styleUrls: ['./inventory.component.scss']
})
export class InventoryComponent implements OnInit {

  sails: SailDto[] = [];
  boards: BoardDto[] = [];

  constructor(private inventoryService: InventoryService) { }

  ngOnInit(): void {
    this.inventoryService.getSails().subscribe(sails => {
      this.sails = sails;
    });
    this.inventoryService.getBoards().subscribe(boards => {
      this.boards = boards;
    });
  }

}
