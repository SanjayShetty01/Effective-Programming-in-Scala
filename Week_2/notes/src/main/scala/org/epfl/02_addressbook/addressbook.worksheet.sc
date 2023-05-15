case class AddressBook(contacts: List[Contact])

case class Contact(
  name: String,
  email: String,
  phoneNumbers: List[String]
)

val alice = Contact("Alice", "alice@sca.la", List())
val bob   = Contact("Bob", "bob@sca.la", List("+41787829420"))

val addressBook = AddressBook(List(alice, bob))

// Constructing Lists

val fruits = List("apples", "oranges", "pears")
val nums   = List(1, 2, 3, 4)
val diag3  = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))
val empty  = List()

// Addressbook continued...

val numberOfContacts: Int = addressBook.contacts.size

val isAliceInContacts = addressBook.contacts.contains(alice)

val contactNames: List[String] =
  addressBook
    .contacts
    .map(contact => contact.name)

val contactEmail : List[String] = 
  addressBook
  .contacts
  .map(contact => contact.email)


val contactsWithPhone: List[Contact] =
  addressBook
    .contacts
    .filter(contact => contact.phoneNumbers.nonEmpty)

// An aside on functions

val increment: Int => Int =
  x => {
    val result = x + 1
    result
  }

val add =
  (x: Int, y: Int) => x + y

add(1, increment(2))

// Addressbook continued...

val allPhoneNumbersFirstAttempt =
  addressBook.contacts.map(contact => contact.phoneNumbers)

val allPhoneNumbers =
  addressBook.contacts.flatMap(contact => contact.phoneNumbers)



// Method vs Function

def incrementMethod(x: Int): Int = x + 1

val incrementFunction: Int => Int = x => x +1 

incrementMethod(2)

incrementFunction(2)

// You can pass a function to a function, you same can't be done for a method.

//when we call 
incrementFunction(2)

// is equivalent to 

incrementFunction.apply(2)


val xs: List[Int] = List(1,2,3)

def incrementEg(x: Int): Int = x +1

xs.map(increment)

// using placeholders

val incrementPlaceHolder: Int => Int = _ + 1

val endsWithScaDotLaPlaceHolder: Contact => Boolean = _.email.endsWith("@sca.la")

// below three does the same

val incrementEg2: Int => Int = x => x + 1
val incrementEg2_1 = (x: Int) => x + 1
val incrementEg2_2 = (_: Int) + 1


val add2: (Int, Int) => Int = _ + _
// this is equivalent to
val add2_1: (Int, Int) => Int = (x1, x2) => x1 + x2

// Wildcards
val puzzle: Int => Int = _ =>  42
// _ followed by => is known as wildcard and not placeholders

puzzle(2)

val placeholder = (_: Int) + 1

val wildcard = (_: Int) => 42


