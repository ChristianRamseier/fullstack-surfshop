plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    api(project(":commons:common-domain-serialization"))
    api(project(":capabilities:base-capability"))
    api(project(":capabilities:rest-api-capability"))
    api("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.10.3")
}
