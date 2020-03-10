plugins {
    kotlin("jvm")
}

dependencies {
    api(project(":capabilities:base-capability"))
    api("org.springframework.boot:spring-boot")
    api("org.springframework.boot:spring-boot-autoconfigure")
}
