plugins {
    kotlin("jvm")
    id("org.springframework.boot")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":capabilities:app-capability"))
    implementation(project(":weather:water-level-service"))
    implementation(project(":weather:wind-service"))
}
