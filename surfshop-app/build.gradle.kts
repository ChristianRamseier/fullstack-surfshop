plugins {
    kotlin("jvm")
    id("org.springframework.boot")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":capabilities:app-capability"))
    implementation(project(":reservation:reservation-service"))
    implementation(project(":reservation:reservation"))
    implementation(project(":customer:customer-service"))
    implementation(project(":customer:customer"))
    implementation(project(":inventory:inventory-service"))
    implementation(project(":inventory:inventory"))
    implementation(project(":dashboard:dashboard"))
    implementation(project(":weather:weather-station"))
}
