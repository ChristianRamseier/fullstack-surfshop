plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":capabilities:rest-capability"))
    implementation(project(":customer:customer-api"))
    implementation(project(":customer:customer-service-api"))
    implementation(project(":commons:common-domain"))
}
