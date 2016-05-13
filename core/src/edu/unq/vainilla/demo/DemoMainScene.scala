package edu.unq.vainilla.demo

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.math.Vector3
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

  override def render(implicit spriteBatch: SpriteBatch, deltaTime: Float) {
    super.render
    spriteBatch.draw(img, imgX, imgY)
  }

  override def touchDown: PartialFunction[TouchDown, Unit] = {
    case TouchDown(x, y, _, _) =>
      val vector = camera.unproject(new Vector3(x, y, 0))
      imgX = vector.x
      imgY = vector.y
  }

}
