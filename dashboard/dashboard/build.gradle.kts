plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":capabilities:rest-capability"))
    implementation(project(":capabilities:rest-consumer-capability"))
    implementation(project(":dashboard:dashboard-api"))
    implementation(project(":reservation:reservation-service-api"))
    implementation(project(":weather:wind-service-api"))
    implementation(project(":weather:water-level-service-api"))
    implementation(project(":commons:common-domain"))
}
