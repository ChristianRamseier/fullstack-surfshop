import {ReservedSailDto} from './reserved-sail-dto';
import {ReservedBoardDto} from './reserved-board-dto';

export interface ReservationDto {
  date: string;
  id: string;
  sail: ReservedSailDto;
  board: ReservedBoardDto;
}
