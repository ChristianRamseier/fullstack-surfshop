import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {SailDto} from './dto/sail-dto';
import {BoardDto} from './dto/board-dto';

@Injectable({
  providedIn: 'root'
})
export class InventoryService {

  constructor(private httpClient: HttpClient) { }

  getBoards(): Observable<BoardDto[]> {
    return this.httpClient.get('/api/inventory/board') as Observable<BoardDto[]>;
  }

  getSails(): Observable<SailDto[]> {
    return this.httpClient.get('/api/inventory/sail') as Observable<SailDto[]>;
  }

}
