package edu.unq.vainilla.demo

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import edu.unq.vainilla.core.input.InputHandler
import edu.unq.vainilla.core.{GameScene, VanillaGame}

class DemoGame extends GameScene with InputHandler {

  var img: Texture = _
  var imgX: Int = 0
  var imgY: Int = 0

  override def create {
    img = new Texture("badlogic.jpg")
  }

  def render(batch: SpriteBatch) {
    batch.draw(img, imgX, imgY)
  }

  override def touchDown(screenX: Int, screenY: Int, pointer: Int, button: Int): Boolean = {
    imgX = screenX
    imgY = VanillaGame.config.height - screenY
    true
  }
}
