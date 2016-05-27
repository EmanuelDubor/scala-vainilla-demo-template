package edu.unq.vainilla.demo

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import edu.unq.vainilla.core.gamescene.SimpleGameScene
import edu.unq.vainilla.core.input.{SimpleInputHandler, TouchDown}

class DemoMainScene extends SimpleGameScene with SimpleInputHandler {

  var img: Texture = _
  var imgX: Float = 0
  var imgY: Float = 0

  override def create {
    super.create
    img = new Texture("badlogic.jpg")
  }

  override def render(implicit spriteBatch: SpriteBatch) {
    super.render
    spriteBatch.draw(img, imgX, imgY)
  }

  override def touchDown: PartialFunction[TouchDown, Unit] = {
    case TouchDown(screenCords, _, _) =>
      val cords = screenCords.localize
      imgX = cords.x
      imgY = cords.y
  }

}
