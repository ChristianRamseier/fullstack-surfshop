plugins {
    kotlin("jvm")
}

dependencies {
    api(platform("org.springframework.boot:spring-boot-dependencies:${rootProject.ext["springVersion"]}"))
    api(platform("org.springframework.cloud:spring-cloud-dependencies:${rootProject.ext["cloudVersion"]}"))
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}
