package org.gitgui

import javafx.stage.Stage
import org.gitgui.view.GitGuiView
import org.junit.Test
import org.testfx.assertions.api.Assertions.*
import org.testfx.framework.junit.ApplicationTest

class TestView: ApplicationTest() {

    lateinit var view: GitGuiView

    override fun start(stage: Stage){
        view = GitGuiView()
    }

    @Test
    fun test_enviroment_works(){
        assertThat(view.root).hasChild(".label")
    }
}