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

tasks.register<Copy>("copy-resourcepack") {
    dependsOn(":sfgalaxy-assets:resourcepack")

    from("sfgalaxy-assets/build/dist/resourcepack.zip")
    into(layout.buildDirectory.dir("libs"))
}

tasks.register<Copy>("copy-datapack") {
    dependsOn(":sfgalaxy-assets:datapack")

    from("sfgalaxy-assets/build/dist/datapack.zip")
    into(layout.buildDirectory.dir("libs"))
}

tasks.register("copy") {
    dependsOn("copy-resourcepack")
    dependsOn("copy-datapack")
}

tasks.named("clean") { mustRunAfter(":sfgalaxy:clean") }
tasks.named("build") { mustRunAfter(":sfgalaxy:build") }
tasks.named("shadowJar") { mustRunAfter(":sfgalaxy:shadowJar") }
tasks.named("copy") { mustRunAfter("shadowJar") }

tasks.register("dist") {
    dependsOn(":sfgalaxy-assets:clean")
    dependsOn(":sfgalaxy-api:clean")
    dependsOn(":sfgalaxy:clean")
    dependsOn("clean")

    dependsOn(":sfgalaxy-assets:build")
    dependsOn(":sfgalaxy-api:build")
    dependsOn(":sfgalaxy:build")
    dependsOn("build")
    
    dependsOn(":sfgalaxy-api:shadowJar")
    dependsOn(":sfgalaxy:shadowJar")
    dependsOn("shadowJar")

    dependsOn("copy")

    doFirst {
        println("\nBuilding project for distribution...")
    }

    doLast {
        val files = file("./build/libs").listFiles().sorted()
        files.forEach { file ->
            if (file.isFile) {
                println("--> Built: ${file.name}")
            }
        }

        println("Done!")
    }
}
