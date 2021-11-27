package $sketch$

import processing.core._
import PConstants._
import PApplet._

object Main extends PApplet {
  def main(args:Array[String]): Unit = {
    PApplet.main("$sketch$.Main", args)
  }
}

class Main extends PApplet {

  override def setup(): Unit = {
    if (args != null) {
      // Process any arguments here
      println(args.mkString(" "))
    }

    background(100)
  }

  override def settings(): Unit = {
    size(1024, 768)
  }

  override def draw {

  }
}
