plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    api(project(":capabilities:base-capability"))
    api("org.springframework:spring-webmvc")
    api("org.springframework.cloud:spring-cloud-openfeign-core")
}
