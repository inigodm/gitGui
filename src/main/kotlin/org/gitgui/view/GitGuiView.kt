package org.gitgui.view

import javafx.scene.layout.HBox
import javafx.scene.layout.VBox
import org.gitgui.app.Styles
import tornadofx.*

class GitGuiView2 : View("Hello TornadoFX") {
    override val root = hbox {
        label(title) {
            addClass(Styles.heading)
        }
    }
}

class GitGuiView: View(""){
    override val root : VBox by fxml()
}