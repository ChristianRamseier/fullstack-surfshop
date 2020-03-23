plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
    kotlin("plugin.jpa")
    kotlin("plugin.noarg")
}

dependencies {
    implementation(project(":commons:common-domain"))
    implementation(project(":capabilities:base-capability"))
    api("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("com.h2database:h2:1.4.200")
    implementation("org.flywaydb:flyway-core:6.3.1")
}
