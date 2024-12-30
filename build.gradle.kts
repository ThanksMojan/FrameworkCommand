plugins {
    kotlin("jvm") version "1.6.10"
    `java`
}

group = "git.thanksmojan"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven { url = uri("https://hub.spigotmc.org/nexus/repository/spigot-repo/") }
}

dependencies {
    //implemented jitpack.io
    implementation(kotlin("stdlib"))
    implementation ("com.github.ThanksMojan:FrameworkCommand:Tag")
    compileOnly("org.spigotmc:spigot-api:1.8.8-R0.1-SNAPSHOT")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}