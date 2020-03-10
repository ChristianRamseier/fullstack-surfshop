import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {CustomerComponent} from "./customer/customer.component";
import {ReservationComponent} from "./reservation/reservation.component";
import {InventoryComponent} from "./inventory/inventory.component";
import {DashboardComponent} from "./dashboard/dashboard.component";
import {WeatherComponent} from "./weather/weather.component";


const routes: Routes = [
  { path: 'customer', component: CustomerComponent },
  { path: 'reservation', component: ReservationComponent },
  { path: 'inventory', component: InventoryComponent },
  { path: 'weather', component: WeatherComponent },
  { path: '**', component: DashboardComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
