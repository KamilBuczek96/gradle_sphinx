package com.kamilbuczek.plugin.docker


import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.DefaultTask

abstract class DockerBuildTask extends DefaultTask {

    @InputFile
    abstract RegularFileProperty getDockerfile()

    @InputDirectory
    abstract DirectoryProperty getContext()

    @TaskAction
    def dockerBuild(){
        println("Trying to build docker image using dockerfile: ${dockerfile.get()}")
        println("Build context is: ${context.get()}")
    }
}