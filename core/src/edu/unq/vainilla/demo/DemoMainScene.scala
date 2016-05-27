package edu.unq.vainilla.demo

import com.badlogic.gdx.graphics.Texture
import edu.unq.vainilla.core.appearence.Appearence
import edu.unq.vainilla.core.gamecomponent.{GameComponent, SimpleGameComponent}
import edu.unq.vainilla.core.gamescene.SimpleGameScene
import edu.unq.vainilla.core.input.{SimpleInputHandler, TouchDown}

class DemoMainScene extends SimpleGameScene with SimpleInputHandler {

  var badlogicLogo: GameComponent = _

  override def create {
    super.create
    val img = new Texture("badlogic.jpg")
    badlogicLogo = new SimpleGameComponent(Appearence(img))
    components += badlogicLogo
  }

  override def touchDown: PartialFunction[TouchDown, Unit] = {
    case TouchDown(screenCords, _, _) =>
      val cords = screenCords.localize
      badlogicLogo.position = cords
  }

}
