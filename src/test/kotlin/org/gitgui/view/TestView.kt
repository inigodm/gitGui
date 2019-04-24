package org.gitgui.view

import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.stage.Stage
import org.junit.Test
import org.loadui.testfx.GuiTest


class TestView: GuiTest() {
    override fun getRootNode(): Parent {
        return FXMLLoader.load(javaClass.getResource("GitGuiView.fxml"))
    }

    lateinit var view: GitGuiView

    fun start(stage: Stage){
        view = GitGuiView()
    }

    @Test
    fun test_enviroment_works(){
        //assertThat(view.root).hasChild(".MenuBar")
    }
}