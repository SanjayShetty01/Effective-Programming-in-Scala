// Collection Extra Notes

//concating collection

List(1,2,3) ++ List(4,5,6)

// This can be done with any types of collection types

// we can use dot-notation
List(1,2,3).++(List(4,5,6))

// these contaction are immutable

// for mutable contaction we use ++=

import scala.collection.mutable.ArrayBuffer

val first = ArrayBuffer(1, 2)
val second = ArrayBuffer(3, 4)
first ++= second
first // ArrayBuffer(1, 2, 3, 4)
second


// Mutable prepend and append (+=)

val data = ArrayBuffer(1, 2, 3)
data += 4
0 +=: data
data

// Mutably removing the elements

val a = ArrayBuffer(1, 2, 3, 3, 4)
a -= 3
a // ArrayBuffer(1, 2, 3, 4)

// The --= method removes all the elements found in another collection

val b = ArrayBuffer(1, 2, 3, 3, 4)
b --= List(3, 4, 5)
b



/*

Symbols

▶ + is updated
▶ ++ is concat
▶ - is removed
▶ -- is removedAll
▶ +: is prepended
▶ :+ is appended
▶ += is addOne
▶ ++= is addAll

*/


// Querying collections

val data1 = ArrayBuffer(1, 2, 3, 4)

data1.exists(x => x < 0)

data1.forall(x => x > 0)