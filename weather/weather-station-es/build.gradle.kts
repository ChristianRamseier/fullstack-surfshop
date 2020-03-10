plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":capabilities:rest-capability"))
    implementation(project(":weather:weather-station-es-api"))
    implementation(project(":weather:water-level-cs-api"))
    implementation(project(":weather:wind-cs-api"))
    implementation(project(":commons:common-domain"))
}
