package com.kamilbuczek.plugin.docker

import org.gradle.api.provider.Property

interface DockerExtension {
    Property<File> getDockerfile()
    Property<File> getContext()
}
