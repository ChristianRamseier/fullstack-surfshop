plugins {
    kotlin("jvm")
}

dependencies {
    api(platform("org.springframework.boot:spring-boot-dependencies:${rootProject.ext["springVersion"]}"))
    api(platform("org.springframework.cloud:spring-cloud-dependencies:${rootProject.ext["cloudVersion"]}"))
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    api("org.jmolecules:jmolecules-ddd:1.3.0")
    api("org.jmolecules:jmolecules-layered-architecture:1.3.0")
}
