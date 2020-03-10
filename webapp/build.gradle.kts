plugins {
    kotlin("jvm")
    id("com.github.node-gradle.node")
}

node {
    version = "12.16.1"
    npmVersion = "6.13.4"
    distBaseUrl = "https://nodejs.org/dist"
    npmInstallCommand = "install"
    download = true
    workDir = file("${project.buildDir}/nodejs")
    npmWorkDir = file("${project.buildDir}/npm")
    nodeModulesDir = file("${project.projectDir}")
}
