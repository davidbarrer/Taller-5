package example

import math.Pi


object Trait extends App {


   //------------------------------------------------------------------------------------------------------------

  //Exercise 1.



  /**
   * Trait Felino Creates the characteristics of a Feline, to extend into Leon, Gato, Tigre and Jaguar classes and
   * implement the vals on each class with different values
   */
  trait Felino {
    val color: String
    val sonido: String
  }

  case class Leon (val tamañoMelena:Int,
              override val color: String ,
              override val sonido: String) extends Felino {
  }



  case class Gato(val comidaFavorita:String,
             override val color: String ,
             override val sonido: String ) extends Felino {
  }

  case class Tigre(override val color: String ,
                   override val sonido: String )
    extends Felino {
  }

  case class Jaguar(override val color: String ,
                    override val sonido: String) extends Felino{

  }

  val tigre = new Tigre("Naranjado Oscuro","Grrrr grrrr grrr")

  //---------------------------------------------------------------------------------------------------------------

  //Exercise 2.
  sealed trait Forma {
    def tamaño():Double
    def perimetro():Double
    def area():Double
    override def toString:String

  }

  case class Circulo(val r:Double) extends Forma{
    override def tamaño = 2.0*this.r
    override def perimetro  = (2.0*Pi*this.r)
    override def area = (Pi*this.r*this.r)
    override def toString = s"Un Circulo de radio ${this.r}"
  }

  val circulo = Circulo(1.0)
  println(circulo.area())



  case class Rectangulo (val base:Double, val altura:Double) extends Rectangular {
    override def perimetro  = (2*this.base) + (2*this.altura)
    override def area = (this.base*this.altura)
    override def toString = s"Un rectangulo de ancho ${base} y largo ${altura}"
  }

  val rectangulo = Rectangulo(3.0,4)

  case class Cuadrado (val lado:Double) extends  Rectangular{
    override def perimetro  = this.lado *4
    override def area = (this.lado * 2)
    override def toString = s"Un cuadrado de ancho y largo de ${this.lado}"
  }

  val cuadrado = Cuadrado(3.0)
  println(cuadrado.tamaño)


  //---------------------------------------------------------------------------------------------------------------

  //Exercise 3.
  //Trait rectangular is a modeling trait to rectangular classes.
  trait Rectangular extends Forma {
    override def tamaño: Double = 4.0
    override def perimetro: Double
    override def area:Double
  }



  //---------------------------------------------------------------------------------------------------------------

  //Exercise 4.
    //Draw Object, implements the apply method to return the toString method of each type of element
    object Draw {
      def apply(forma:Forma):String = forma match {
        case Circulo(_) => forma.toString
        case Rectangulo(_,_) => forma.toString
        case Cuadrado(_) => forma.toString
      }
  }

  println(Draw(cuadrado))
  println(Draw(circulo))
  println(Draw(rectangulo))


  //---------------------------------------------------------------------------------------------------------------

  //Exercise 5.

  class Color (val Red:Int, val Green:Int, val Blue:Int){

  }

  //Predetermined Colors
  object Color {
    val rojo = new Color(255,0,0)
    val amarillo = new Color(255,255,0)
    val rosa = new Color(255,192,203)
  }


  //Creating an own personalized color
  val colorNegro = new Color(0,0,0)

  //Calling a predetermined Color
  val rojo = Color.rojo
  println(rojo.Red)


}
