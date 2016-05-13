package edu.unq.vainilla.demo.desktop

import edu.unq.vainilla.demo.{DemoMainScene, GameConfigurator}
import edu.unq.vainilla.desktop.VainillaEngine

object DesktopLauncher {

  def main(args: Array[String]) {
    VainillaEngine.mainScene = new DemoMainScene
    VainillaEngine.configurators += new GameConfigurator
    VainillaEngine.configurators += new DesktopConfigurator
    VainillaEngine.delegateInput //Use this if you want your scenes to handle user input
    //    VainillaEngine.inputHandler = new YourInputHandler //Manually set a single input handler

    VainillaEngine.start
  }

}
