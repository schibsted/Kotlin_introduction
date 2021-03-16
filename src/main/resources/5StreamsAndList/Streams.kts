/** create an list**/

val strings = listOf("One", "another", "something")
val stringsWhitExplicitType = listOf<String>("One", "another", "something")

/**map to modify a list**/

val upperCase = strings.map { it.toUpperCase() }
val upperCase = strings.map { it -> it.toUpperCase() }//Same it is just default name

/** Usual operators for stream modify **/


strings.find { it.length == 3 }
strings.filter { it.length == 3 }
strings.isNotEmpty()
strings.ifEmpty { "DefaultVal" }


data class Car(val name: String, val brand: String, val year: Int)

val cars = listOf(
    Car("A", "a2", 2020),
    Car("B", "a1", 2020),
    Car("C", "a1", 2020),
    Car("D", "a2", 2020),
)
val groupBy: Map<String, List<Car>> = cars.groupBy { it.brand }

//Good to know that it exist
strings.let { println(it) }
//good for one line functions and others


//And a lot more of them
/** All those could be stacked **/

/**loop**/

//for (i in 2..9 step 2) {
for (i in 1..9) {
    println(i)
}

val numbers = arrayOf("first", "second", "third", "fourth")
for (n in numbers) {
    println(n)
}

val listOfValues = 1.rangeTo(10)
