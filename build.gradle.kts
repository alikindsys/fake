plugins {
    kotlin("jvm") version "1.8.0"
    kotlin("plugin.serialization") version "1.8.0"
}

group = "io.github.roridev"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-client-core:2.2.3")
    implementation("io.arrow-kt:arrow-core:1.0.1")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.0")
}

kotlin {
    jvmToolchain(8)
}