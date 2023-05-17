// ArrayBuffer
import scala.collection.mutable

// immutable are availabel by default
//but mutable has to be imported

val buffer = mutable.ArrayBuffer("foo", "bar", "baz")
buffer(1) = "quux"
println(buffer)

// Interesting stuff happens when the following line is uncommented...
// buffer += "bah"
// println(buffer)

// scala.collection.immutable.Set
val xs = Set(2, 4, 6, 8)
val ys = xs + 10
println(ys)
val zs = xs + 2
println(zs)

// scala.collection.immutable.Map
val ages: Map[String, Int] = Map("Alice" -> 42, "Bob" -> 30)

ages.get("Alice") // Some(42)
ages.get("Carol") // None

val updatedAges = ages + ("Daniel" -> 21)
println(updatedAges)

val updatedAges2 = updatedAges + ("Bob" -> 31)
println(updatedAges2)

// Tuples
ages.foreach ((name, age) =>
  println(s"$name is $age years old.")
)

val pair: (String, Int) = ("Alice", 42)
val tuple: (Int, String, Boolean) = (42, "foo", true)

// `Tuple2` shorthand notation
Map("Alice" -> 42, "Bob" -> 30) == Map(("Alice", 42), ("Bob", 30))

// Accessing Tuple elements
val fortyTwo = tuple(0)
val foo      = tuple(1)

// Destructured assignment
val (fortyTwo_, foo_, bool_) = tuple

tuple match
  case (fortyTwo, foo, bool) => fortyTwo.toString + " " + foo + " " + bool.toString


// Transforming a `Map`
val ages2 = ages.map { case (name, age) =>
  (name.toUpperCase, age + 1)
}

// Conversions Between Collections

val ageList = Map("Alice" -> 42).to(List)
val ageSet = ageList.to(Set)

// Sorting
val ageList2 = Map("Alice" -> 42, "Bob" -> 30).to(List)
val sortedAgeList = ageList2.sortBy { case (name, age) => age }

// Grouping
val emails = List("alice@sca.la", "bob@sca.la", "carol@earth.world")

// Function extracting the domain name from an email address
val domain: String => String =
  email => email.dropWhile(c => c != '@').drop(1)

val emailsByDomain = emails.groupBy(domain)
println(emailsByDomain)

// Grouping & Mapping

val people = List("Alice" -> 30, "Bob" -> 21, "Carol" -> 30)
val age: (String, Int) => Int =
  (_, age) => age
val name: (String, Int) => String =
  (name, _) => name
people.groupMap(age(_, _))(name(_, _))



// creating collections

// Contructing empty collections

List.empty
Map.empty
mutable.ArrayBuffer.empty

// Since the above code has type nothing.

var a = List.empty

a.prepended(5).appended("hi")

val myList: List[Matchable] = List("hello", 42, true, Some("world"))

myList.foreach {
  case s: String => println(s"Found a string: $s")
  case i: Int => println(s"Found an integer: $i")
  case b: Boolean => println(s"Found a boolean: $b")
  case Some(value) => println(s"Found an option: $value")
  case _ => println("Found something else")
}

// when we have matchable

// to get type control 

List.empty[Int]
Map.empty[String, Boolean]
mutable.ArrayBuffer.empty[Double]

// creating maps

Map('a' -> true, 'e' -> true, 'b' -> false)

val b : (String, Int) = ("Alice", 1)


(10, "hello") match 
  case (number, greeting) => s" $greeting! The number is $number"

// Appending and prepending elements

0 +: List(1,2,3)

List(1,2,3) :+ 4

// for list we use `+`

Map("a" -> true) + ("e" -> false)

Map("a" -> 2, "b" -> 1)



