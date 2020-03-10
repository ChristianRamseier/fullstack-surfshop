package com.surfshop.dashboard

import com.surfshop.dashboard.dto.DashboardOverviewDto
import org.springframework.web.bind.annotation.GetMapping

interface DashboardApi {

    @GetMapping("/dashboard")
    fun getOverview(): DashboardOverviewDto

}
