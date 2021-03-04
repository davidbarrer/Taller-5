package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TraitSpec extends AnyFlatSpec with Matchers {



  //Exercise 3 and 2.
  "Creating a Rectangular object(Cuadrado or Rectangulo) and calling his size" should "return 4" in {
    val cuadrado = Trait.Cuadrado(3.0)
    cuadrado.tamaño shouldEqual 4
  }


  //Exercise 4 and 2.
  "Calling the apply method in Draw object, passing a cuadrado figure Draw(cuadrado)" should "return Un cuadrado de ancho y largo de ${this.lado}" in{
    val cuadrado = Trait.Cuadrado(3.0)
    cuadrado.toString shouldEqual "Un cuadrado de ancho y largo de 3.0"
  }


  //Exercise 5.
  "Calling the created  val rojo = Color.rojo.Red" should "be 255" in{
    val rojo = Trait.Color.rojo.Red shouldEqual 255
  }

  "Calling the created  val rojo = Color.rojo.Green" should "be 0" in{
    val rojo = Trait.Color.rojo.Green shouldEqual 0}

  "Calling the created  val rojo = Color.rojo.Blue" should "be 0" in{
    val rojo = Trait.Color.rojo.Blue shouldEqual 0}

}
