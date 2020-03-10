plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":inventory:inventory-cs-api"))
    implementation(project(":capabilities:service-capability"))
    implementation(project(":commons:common-domain"))
}
