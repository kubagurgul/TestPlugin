package com.github.kubagurgul.testplugin.services

import com.github.kubagurgul.testplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
