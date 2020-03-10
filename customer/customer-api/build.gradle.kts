plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":capabilities:rest-api-capability"))
    implementation(project(":commons:common-domain"))
}
