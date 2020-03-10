plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":customer:customer-service-api"))
    implementation(project(":capabilities:service-capability"))
    implementation(project(":commons:common-domain"))
}
