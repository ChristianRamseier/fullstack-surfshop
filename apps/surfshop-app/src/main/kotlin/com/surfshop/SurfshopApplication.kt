package com.surfshop

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WeatherServicesApplication

fun main(args: Array<String>) {
	runApplication<WeatherServicesApplication>(*args)
}
