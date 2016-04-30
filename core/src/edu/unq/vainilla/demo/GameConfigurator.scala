package edu.unq.vainilla.demo

import edu.unq.vainilla.core.configuration.{Configuration, Configurator}

class GameConfigurator extends Configurator {
  def configure(config: Configuration): Configuration = {
    config.title = "An Awesome Demo"
    config
  }
}
