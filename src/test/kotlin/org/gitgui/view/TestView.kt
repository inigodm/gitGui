package org.gitgui.view

import javafx.stage.Stage
import org.gitgui.view.view.MainView
import org.junit.Test
import org.testfx.assertions.api.Assertions.*
import org.testfx.framework.junit.ApplicationTest

class TestView: ApplicationTest() {

    lateinit var view: MainView

    override fun start(stage: Stage){
        view = MainView()
    }

    @Test
    fun test_enviroment_works(){
        assertThat(view.root).hasChild(".label")
    }
}