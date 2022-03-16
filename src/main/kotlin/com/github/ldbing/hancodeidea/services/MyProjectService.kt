package com.github.ldbing.hancodeidea.services

import com.intellij.openapi.project.Project
import com.github.ldbing.hancodeidea.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
