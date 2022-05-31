plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

allprojects {
    repositories {
        mavenCentral()
        maven {
            url = uri("https://repo.destroystokyo.com/repository/maven-public/")
        }

        maven {
            url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
        }

        maven {
            url = uri("https://jitpack.io")
        }
    }
}

dependencies {
    implementation(project(":sfgalaxy"))
}
