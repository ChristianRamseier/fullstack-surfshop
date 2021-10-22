plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":capabilities:rest-capability"))
    implementation(project(":reservation:reservation-api"))
    implementation(project(":reservation:reservation-service-api"))
    implementation(project(":inventory:inventory-service-api"))
    implementation(project(":customer:customer-service-api"))
    implementation(project(":commons:common-domain"))
}
