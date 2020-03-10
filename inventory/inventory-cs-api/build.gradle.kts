plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":capabilities:base-capability"))
    implementation(project(":commons:common-domain"))
}
