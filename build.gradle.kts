import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
	extra["springVersion"] = "2.2.5.RELEASE"
	extra["cloudVersion"] = "Hoxton.SR3"
}

plugins {
	kotlin("jvm")
}

group = "com.surfshop"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

allprojects {

	repositories {
		mavenCentral()
	}

	tasks.withType<Test> {
		useJUnitPlatform()
	}

	tasks.withType<KotlinCompile> {
		kotlinOptions {
			freeCompilerArgs = listOf("-Xjsr305=strict")
			jvmTarget = "1.8"
		}
	}

}

