import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {DashboardOverviewDto} from "./dashboard-overview-dto";

@Injectable({
  providedIn: 'root'
})
export class DashboardService {

  constructor(private httpClient: HttpClient) { }

  getDashboardOverview(): Observable<DashboardOverviewDto> {
    return this.httpClient.get('/api/dashboard') as Observable<DashboardOverviewDto>;
  }

}
