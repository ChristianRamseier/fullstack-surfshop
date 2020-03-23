plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
    kotlin("plugin.noarg")
    kotlin("plugin.jpa")
}

dependencies {
    implementation(project(":inventory:inventory-service-api"))
    implementation(project(":capabilities:service-capability"))
    implementation(project(":capabilities:database-capability"))
    implementation(project(":commons:common-domain"))
}
