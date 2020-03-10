plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":capabilities:rest-capability"))
    implementation(project(":dashboard:dashboard-api"))
    implementation(project(":reservation:reservation-service-api"))
    implementation(project(":commons:common-domain"))
}
