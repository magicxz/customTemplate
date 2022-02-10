package com.github.magicxz.customtemplate.services

import com.intellij.openapi.project.Project
import com.github.magicxz.customtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
