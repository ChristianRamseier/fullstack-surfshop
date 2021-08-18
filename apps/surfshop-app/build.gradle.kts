import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    id("org.springframework.boot")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":capabilities:app-capability"))
    implementation(project(":reservation:reservation-service"))
    implementation(project(":reservation:reservation"))
    implementation(project(":customer:customer-service"))
    implementation(project(":customer:customer"))
    implementation(project(":inventory:inventory-service"))
    implementation(project(":inventory:inventory"))
    implementation(project(":dashboard:dashboard"))
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
