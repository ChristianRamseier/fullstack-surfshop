package com.surfshop.dashboard.dto

import com.surfshop.common.Direction
import com.surfshop.common.Speed

data class DashboardOverviewDto(
        val todaysReservations: Number,
        val conditionSummary: String,
        val windDirection: Direction,
        val windSpeed: Speed
) {

}
