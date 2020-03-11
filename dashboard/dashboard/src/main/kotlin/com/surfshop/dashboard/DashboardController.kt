package com.surfshop.dashboard

import com.surfshop.dashboard.domain.SurfConditions
import com.surfshop.dashboard.dto.DashboardOverviewDto
import com.surfshop.reservation.service.ReservationServiceApi
import com.surfshop.service.waterlevel.WaterLevelServiceApi
import com.surfshop.service.wind.WindServiceApi
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@RestController
class DashboardController(
        val reservationService: ReservationServiceApi,
        val windServiceApi: WindServiceApi,
        val waterLevelApi: WaterLevelServiceApi
) : DashboardApi {

    override fun getOverview(): DashboardOverviewDto {
        val reservations = reservationService.getReservations()
        val wind = windServiceApi.getWind()
        val waterLevel = waterLevelApi.getWaterLevel()
        val conditionSummary = SurfConditions(wind.speed, wind.direction, waterLevel.waterLevel)
                .getConditionSummary()
        return DashboardOverviewDto(
                todaysReservations = reservations.filter { it.date == LocalDate.now() }.size,
                windDirection = wind.direction,
                windSpeed = wind.speed,
                conditionSummary = conditionSummary
        )
    }


}
