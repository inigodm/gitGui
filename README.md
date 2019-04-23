# gitGui
Git Graphic User Interface

Installation, in Idea:

Install intellij TornadoFx plugin and restart (In file-> settings-> plugins)
Download javaFX libraries and unzip them in your PC
Run -> Edit configurations -> VM options --module-path /path/to/JavaFX/lib --add-modules=javafx.controls

Alternatively it can be necessary to add manually the modules:
File -> Project Structure -> Libraries -> add: add JavaFx libraries
File -> Project Structure -> Modules -> add (+): add JavaFx libraries

But ir shouldn't be necessary because them now are in the pom.xml
