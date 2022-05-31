tasks.register<Zip>("resourcepack") {
    archiveFileName.set("resourcepack.zip")
    destinationDirectory.set(layout.buildDirectory.dir("dist"))

    from("./resourcepack")
}

tasks.register<Zip>("datapack") {
    archiveFileName.set("datapack.zip")
    destinationDirectory.set(layout.buildDirectory.dir("dist"))

    from("./datapack")
}

tasks.register("build") {
    dependsOn("resourcepack")
    dependsOn("datapack")
}

tasks.register<Delete>("clean") {
    delete(buildDir)
}

tasks.named("build") { mustRunAfter(":clean") }
