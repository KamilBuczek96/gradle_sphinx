package com.kamilbuczek.plugin.docker

import org.gradle.api.provider.Property
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.file.DirectoryProperty

interface DockerExtension {
    Property<File> getDockerfile()
    Property<File> getContext()
}
