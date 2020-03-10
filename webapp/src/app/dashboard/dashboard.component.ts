import {Component, OnInit} from '@angular/core';
import {DashboardService} from "./service/dashboard.service";
import {DashboardOverviewDto} from "./service/dashboard-overview-dto";

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.scss']
})
export class DashboardComponent implements OnInit {

  dashboardOverview: DashboardOverviewDto;

  constructor(
    private dashboardService: DashboardService
  ) {
  }

  ngOnInit(): void {
    this.dashboardService.getDashboardOverview().subscribe(dashboardOverview => {
        this.dashboardOverview = dashboardOverview;
      });
  }

}
