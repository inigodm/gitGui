package org.gitgui.view.view

import org.gitgui.view.app.Styles
import tornadofx.*

class GitGuiView : View("Hello TornadoFX") {
    override val root = hbox {
        label(title) {
            addClass(Styles.heading)
        }
    }
}