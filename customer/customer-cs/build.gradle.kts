plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":customer:customer-cs-api"))
    implementation(project(":capabilities:service-capability"))
    implementation(project(":commons:common-domain"))
}
