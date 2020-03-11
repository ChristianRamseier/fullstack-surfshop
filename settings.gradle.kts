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
include(":capabilities:rest-consumer-capability")
include(":capabilities:rest-api-capability")
include(":capabilities:database-capability")

// Common Modules
include(":commons:common-domain")
include(":commons:common-domain-serialization")

// Functional Modules
include(":dashboard:dashboard")
include(":dashboard:dashboard-api")
include(":customer:customer-service")
include(":customer:customer-service-api")
include(":customer:customer")
include(":customer:customer-api")
include(":inventory:inventory-service")
include(":inventory:inventory-service-api")
include(":inventory:inventory")
include(":inventory:inventory-api")
include(":reservation:reservation-service")
include(":reservation:reservation-service-api")
include(":reservation:reservation")
include(":reservation:reservation-api")
include(":weather:wind-service")
include(":weather:wind-service-api")
include(":weather:water-level-service")
include(":weather:water-level-service-api")

// Deployment Modules
include(":apps:surfshop-app")
include(":apps:weather-services-app")

// Webapp Module
include(":webapp")
