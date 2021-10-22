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

    testImplementation("org.jmolecules.integrations:jmolecules-archunit:0.5.0")
    testImplementation("com.tngtech.archunit:archunit:0.21.0")
    testImplementation("com.tngtech.archunit:archunit-junit5:0.21.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.3.1")
    testImplementation("org.assertj:assertj-core:3.6.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.3.1")
}
