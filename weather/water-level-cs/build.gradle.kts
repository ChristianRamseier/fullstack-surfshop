plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":weather:water-level-cs-api"))
    implementation(project(":capabilities:rest-capability"))
    implementation(project(":capabilities:service-capability"))
    implementation(project(":commons:common-domain"))
}
