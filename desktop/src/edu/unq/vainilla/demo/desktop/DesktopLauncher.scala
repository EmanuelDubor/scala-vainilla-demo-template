package edu.unq.vainilla.demo.desktop

import edu.unq.vainilla.demo.{DemoMainScene, GameConfigurator}
import edu.unq.vainilla.desktop.VainillaEngine

object DesktopLauncher extends App {

  VainillaEngine.mainScene = new DemoMainScene
  VainillaEngine.configurators += new GameConfigurator
  VainillaEngine.configurators += new DesktopConfigurator
  VainillaEngine.delegateInput //Use this if you want your scenes to handle user input
  //    VainillaEngine.inputHandler = YourInputHandler //Manually set a single input handler

  VainillaEngine.start

}
