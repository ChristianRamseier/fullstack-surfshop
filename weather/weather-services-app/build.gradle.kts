plugins {
    kotlin("jvm")
    id("org.springframework.boot")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":capabilities:app-capability"))
    implementation(project(":weather:water-level-cs"))
    implementation(project(":weather:wind-cs"))
}
