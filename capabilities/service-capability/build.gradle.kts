plugins {
    kotlin("jvm")
}

dependencies {
    api(project(":capabilities:base-capability"))
    api("org.springframework:spring-context")
}
