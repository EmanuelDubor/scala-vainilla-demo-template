package edu.unq.vainilla.demo.desktop

import edu.unq.vainilla.demo.GameConfigurator
import edu.unq.vainilla.desktop.VainillaEngine

object DesktopLauncher extends App {

  VainillaEngine.configurators += new GameConfigurator
  VainillaEngine.configurators += new DesktopConfigurator

  VainillaEngine.start

}
