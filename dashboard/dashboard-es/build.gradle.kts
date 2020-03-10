plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":capabilities:rest-capability"))
    implementation(project(":dashboard:dashboard-es-api"))
    implementation(project(":reservation:reservation-cs-api"))
    implementation(project(":commons:common-domain"))
}
