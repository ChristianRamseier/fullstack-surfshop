plugins {
    kotlin("jvm")
    id("org.springframework.boot")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":capabilities:app-capability"))
    implementation(project(":reservation:reservation-cs"))
    implementation(project(":reservation:reservation-es"))
    implementation(project(":customer:customer-cs"))
    implementation(project(":customer:customer-es"))
    implementation(project(":inventory:inventory-cs"))
    implementation(project(":inventory:inventory-es"))
    implementation(project(":dashboard:dashboard-es"))
}
