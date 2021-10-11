val listOfNumbers = listOf(4, 5, 2, 4, 3, 5, 3)

//Write a function that takes a list of Int and adds 2 to every element and returns it
//as this (4, 5, 2, 4, 3, 5, 3) to this: (6, 7, 4, 6, 5, 7, 5)

//Write a function that takes a list of Int and prints the values that are bigger than 25

//Write a function that takes a list and count the number that is the same



/** Example further down**/




















































//Add 2 to every number
fun add2(list:List<Int>) = list.map { it + 2 }

//how to run
println(
    add2(listOf(4, 5, 2, 4, 3, 5, 3))
)


//Print values bigger than 25
fun printOver25(list: List<Int>) = list
    .filter { it > 25 }
    .forEach { println("$it is bigger than 25") }

//Write a function that returns true if any number is below zero (two examples)

listOf(4, 5, 2, 4, 3, 5, 3).any { it < 0 }
listOf(4, 5, 2, 4, 3, 5, 3).filter { it < 0 }.isNotEmpty()

//Write a function that takes a list and count the number that is the same

listOf(4, 5, 2, 4, 3, 5, 3).groupBy { it }.map { println("$it.key ${it.value.size}") }