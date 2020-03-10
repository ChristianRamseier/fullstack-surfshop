import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { InventoryComponent } from './inventory/inventory.component';
import { WeatherComponent } from './weather/weather.component';
import { CustomerComponent } from './customer/customer.component';
import { ReservationComponent } from './reservation/reservation.component';
import { LayoutComponent } from './commons/layout/layout.component';
import { ButtonComponent } from './commons/button/button.component';
import { NavigationComponent } from './navigation/navigation.component';

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    InventoryComponent,
    WeatherComponent,
    CustomerComponent,
    ReservationComponent,
    LayoutComponent,
    ButtonComponent,
    NavigationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
