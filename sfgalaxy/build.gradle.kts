plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.18.2-R0.1-SNAPSHOT")
    compileOnly("com.github.Slimefun:Slimefun4:RC-31")
    
    implementation("com.google.guava:guava:31.1-jre")
    implementation(project(":sfgalaxy-api"))
}
