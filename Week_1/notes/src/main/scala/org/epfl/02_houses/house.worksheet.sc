import doodle.syntax.shape

// CASE CLASS LECTURE

 // Domain Modelling

 // using case classes to solve rectangle
 case class Rectangle(width: Int , height: Int): 
    val area : Int = width * height

 val facade = Rectangle(5,3)
 println(facade.area)

 case class Square(width: Int):
   val area: Int = width * width

val sqFacade = Square(5)
print(sqFacade.area)

val smallRectangle = Rectangle(width = 5, height = 10)

val largeRectangle = smallRectangle.copy(width = smallRectangle.width * 2)


smallRectangle

// SEALED  TRAITS

// we can define a shape that is either a rectangle or a square

sealed trait Shape
case class RectangleShape(width: Int, height: Int) extends Shape
case class Circle(radius: Int) extends Shape

// sealed trait don't have contructors

val someShape : Shape = Circle(5)
val someRectangle : RectangleShape = RectangleShape(5,10)

val someRec : Shape = someRectangle

// Type RectangleShape and Cricle are the sub-types of Shape

val someShapeArea = 
   someShape match {
      case RectangleShape(width, height) => width * height
      case Circle(radius) => radius * radius * 3.14
}

RectangleShape(5,10)


someShapeArea


val someCircle = Circle(5)

val circleRadius =   
   someCircle match {
      case circle: Circle => s"This is a circle with radius ${circle.radius}"
      case _ => "NOTTT A CIRCLE"
}



//  Model the action that a user can perform in a messaging system

// subscribe, unsubscribe and post a message 


sealed trait Action
case class Subscribe(channel: Channel) extends Action
case class Unsubscribe(channel: Channel) extends Action
case class PostMessage(channel: Channel, message: String) extends Action

case class Channel(name: String)


val subscribeEffectiveScala = Subscribe(Channel("Effective-Scala"))



sealed trait Shape1
case class Rectangle1(width: Int, height: Int) extends Shape1
case class Circle1(radius: Int) extends Shape1

def area(shape: Shape1): Double =
  shape match
    case Rectangle1(w, h) => w * h
    case Circle1(r)       => r * r * 3.14

area(Rectangle1(5,4))

