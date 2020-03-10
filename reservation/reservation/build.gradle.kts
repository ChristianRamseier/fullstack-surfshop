plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":capabilities:rest-capability"))
    implementation(project(":reservation:reservation-api"))
    implementation(project(":reservation:reservation-service-api"))
    implementation(project(":commons:common-domain"))
}
