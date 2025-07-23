var VERSION = "0.1.0-dev"

var MINESTOM_RELEASE = "2025.07.20-1.21.8"
var BLOCKSMITH_RELEASE = "7f58992"

plugins {
    id("java")
    id("application")
    id("io.freefair.lombok") version "8.14"
    id("com.gradleup.shadow") version "9.0.0-rc1"
}

group = "ing.boykiss"
version = VERSION
application.mainClass = "ing.boykiss.Nonspace"

java.toolchain.languageVersion = JavaLanguageVersion.of(21)

repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    implementation("net.minestom:minestom:${MINESTOM_RELEASE}")
    implementation("com.github.NodiumHosting:Blocksmith:${BLOCKSMITH_RELEASE}")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}