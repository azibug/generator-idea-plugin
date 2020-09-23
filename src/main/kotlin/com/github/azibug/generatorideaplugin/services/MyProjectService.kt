package com.github.azibug.generatorideaplugin.services

import com.intellij.openapi.project.Project
import com.github.azibug.generatorideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
