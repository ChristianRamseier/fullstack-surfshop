plugins {
    kotlin("jvm")
    kotlin("plugin.jpa")
}

dependencies {
    implementation(project(":capabilities:base-capability"))
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
}
