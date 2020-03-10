pluginManagement {
    plugins {
        id("org.springframework.boot") version "2.2.5.RELEASE"
        id("io.spring.dependency-management") version "1.0.9.RELEASE"
        id("org.jetbrains.kotlin.plugin.allopen") version "1.3.61"
        id("com.github.node-gradle.node") version "2.2.2"
        kotlin("jvm") version "1.3.61"
        kotlin("plugin.spring") version "1.3.61"
        kotlin("plugin.jpa") version "1.3.61"
    }
}

// Capability Modules
include(":capabilities:base-capability")
include(":capabilities:service-capability")
include(":capabilities:app-capability")
include(":capabilities:rest-capability")
include(":capabilities:rest-api-capability")
include(":capabilities:database-capability")

// Common Modules
include(":commons:common-domain")

// Functional Modules
include(":dashboard:dashboard-es")
include(":dashboard:dashboard-es-api")
include(":customer:customer-cs")
include(":customer:customer-cs-api")
include(":customer:customer-es")
include(":customer:customer-es-api")
include(":inventory:inventory-cs")
include(":inventory:inventory-cs-api")
include(":inventory:inventory-es")
include(":inventory:inventory-es-api")
include(":reservation:reservation-cs")
include(":reservation:reservation-cs-api")
include(":reservation:reservation-es")
include(":reservation:reservation-es-api")
include(":weather:wind-cs")
include(":weather:wind-cs-api")
include(":weather:water-level-cs")
include(":weather:water-level-cs-api")
include(":weather:weather-station-es")
include(":weather:weather-station-es-api")

// Deployment Modules
include(":surfshop-app")
include(":weather:weather-services-app")

// Webapp Module
include(":webapp")
