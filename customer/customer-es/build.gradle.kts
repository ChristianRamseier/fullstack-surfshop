plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":capabilities:rest-capability"))
    implementation(project(":customer:customer-es-api"))
    implementation(project(":customer:customer-cs-api"))
    implementation(project(":commons:common-domain"))
}
