//Write a function that takes a list of Int and prints the values that are bigger that 25

//Write a function that returns true if any number is below zero

//Write a function that takes a list and count the number of equal numbers



/**How to solve further down**/






















































//Write a function that returns true if any number is below zero

listOf(4, 5, 2, 4, 3, 5, 3).any { it < 0 }
listOf(4, 5, 2, 4, 3, 5, 3).filter { it < 0 }.isNotEmpty()

//Write a function that takes a list and count the number of equal numbers


listOf(4, 5, 2, 4, 3, 5, 3).groupBy { it }.map { println("$it.key ${it.value.size}") }