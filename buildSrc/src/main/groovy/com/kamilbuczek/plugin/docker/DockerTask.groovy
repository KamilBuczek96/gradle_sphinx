package com.kamilbuczek.plugin.docker

import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.Input
import org.gradle.api.DefaultTask

class DockerTask extends DefaultTask {

    @Input
    String dockerProp = "234234234"

    @TaskAction
    def dockerVersion(){
        println("Hello for action of task DockerTask")
        println("Current value of dockerProp is: ${dockerProp}")
    }
}