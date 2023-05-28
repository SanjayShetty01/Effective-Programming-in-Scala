case class AddressBook(contacts: List[Contact])

case class Contact(
  name: String,
  email: String,
  phoneNumbers: List[String]
)

val alice = Contact("Alice", "alice@sca.la", List())
val bob   = Contact("Bob", "bob@sca.la", List("+41787829420"))
val carol = Contact("Carol", "carol@sca.la", List())

val addressBook = AddressBook(List(alice, bob))

addressBook.contacts.foldLeft(0) { (n, contact) =>
  if contact.name.startsWith("A") then n + 1
  else n
}

// How `foldLeft` expands...

def f(acc: String, x: Int): String = s"f($acc, xs($x))"

val z = "z"

val xs = List(0, 1, 2, 3)

xs.foldLeft(z)( (acc, n) => f(acc, n))

// Aside: Multiple parameter lists
def foo(x: Int, y: Int)(f: Int => Int): Int = f(x + 2) + f(y)

foo(0, 10)(i => i * i)

foo(0, 10){ i =>
  i * i
}


// Sequences and maps

// Some collections are sequences since the ordering matters in some of the collections. List and ArrayBuffer are sequencs
// But map is not.

// Head and Tail (only on sequences)
import scala.collection.mutable.ArrayBuffer

val data1 = ArrayBuffer(1,2,4)

data1.head 
data1.tail

// List are linear sequence O(n) operation
// array buffers are indexed sequence O(1) operation

val data3 = List(
  "Alice" -> 42,
  "bob" -> 30,
  "wer" -> 23,
  "owl" -> 4
)


data3.sortBy((_,age)=> age)

data3.sortBy((name,_)=> name)


// maps

val data4 = Map(
  "Alice" -> 42,
  "bob" -> 30,
  "wer" -> 23,
  "owl" -> 4
)

data4.get("Alice")

