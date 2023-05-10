package com.kamilbuczek.plugin.docker

import org.gradle.api.Project
import org.gradle.api.Plugin

import java.lang.reflect.Field

class DockerPlugin implements Plugin<Project> {
    void apply(Project project) {

        project.extensions.create("dockerConfig", DockerExtension)
        project.tasks.register('runDocker', DockerTask){
            dockerProp = project.dockerConfig.docPath.get()
        }
        project.tasks.register('buildDocker', DockerBuildTask){
            // default values
            dockerfile = project.dockerConfig.dockerfile.get()
            context = project.dockerConfig.context.get()
        }
    }
}
