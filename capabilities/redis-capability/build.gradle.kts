import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
    kotlin("plugin.jpa")
    kotlin("plugin.noarg")
}

dependencies {
    implementation(project(":commons:common-domain"))
    api(project(":commons:common-redis"))
    implementation(project(":capabilities:base-capability"))
    api("org.springframework.data:spring-data-redis")
    api("redis.clients:jedis:2.8.0")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.10.3")
    implementation(kotlin("stdlib-jdk8"))
}
repositories {
    mavenCentral()
}
val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
