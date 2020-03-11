package com.surfshop

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SurfshopApplication

fun main(args: Array<String>) {
	runApplication<SurfshopApplication>(*args)
}
