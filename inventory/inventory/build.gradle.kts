plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":capabilities:rest-capability"))
    implementation(project(":inventory:inventory-api"))
    implementation(project(":inventory:inventory-service-api"))
    implementation(project(":commons:common-domain"))
}
