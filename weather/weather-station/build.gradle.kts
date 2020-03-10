plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":capabilities:rest-capability"))
    implementation(project(":weather:weather-station-api"))
    implementation(project(":weather:water-level-service-api"))
    implementation(project(":weather:wind-service-api"))
    implementation(project(":commons:common-domain"))
}
