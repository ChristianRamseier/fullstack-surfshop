plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":capabilities:rest-capability"))
    implementation(project(":inventory:inventory-es-api"))
    implementation(project(":inventory:inventory-cs-api"))
    implementation(project(":commons:common-domain"))
}
