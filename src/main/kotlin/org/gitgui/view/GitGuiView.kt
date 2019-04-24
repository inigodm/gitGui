package org.gitgui.view

import javafx.scene.layout.BorderPane
import javafx.scene.layout.GridPane
import javafx.scene.layout.HBox
import javafx.scene.layout.VBox
import org.gitgui.app.Styles
import tornadofx.*

class GitGuiView : View("Hello TornadoFX") {
    override val root = hbox {
        label(title) {
            addClass(Styles.heading)
        }
    }
}

class GitGuiView2: View("GitGui"){
    override val root : VBox by fxml()
}