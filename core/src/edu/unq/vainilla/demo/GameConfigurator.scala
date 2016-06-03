package edu.unq.vainilla.demo

import edu.unq.vainilla.core.configuration.{Configuration, Configurator}

class GameConfigurator extends Configurator {
  def configure(config: Configuration) = {
    config.title = "An Awesome Demo"
    config.mainScene = new DemoMainScene
    config.delegateInput //Use this to delegate user input to your scenes
  }
}
