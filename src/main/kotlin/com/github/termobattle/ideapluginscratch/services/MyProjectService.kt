package com.github.termobattle.ideapluginscratch.services

import com.intellij.openapi.project.Project
import com.github.termobattle.ideapluginscratch.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
