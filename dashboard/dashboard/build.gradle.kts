import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":capabilities:rest-capability"))
    implementation(project(":capabilities:rest-consumer-capability"))
    implementation(project(":dashboard:dashboard-api"))
    implementation(project(":reservation:reservation-service-api"))
    implementation(project(":weather:wind-service-api"))
    implementation(project(":weather:water-level-service-api"))
    implementation(project(":capabilities:redis-capability"))
    implementation(project(":commons:common-domain"))
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
