package `3DataClasses`

/** Small dog database **/
val dogSchool = DogSchool(Human("Katja"), "Doggis", 100, listOf())

//but we want to know the total income for one DogSchool how?
println(dogSchool.totalIncome()) //But you could
println(dogSchool.name)

val (owner, name, montyCost, dogs) = dogSchool //destructuring (componentX)

val playWhitDataClasses = PlayWhitDataClasses("test")


class PlayWhitDataClasses(
    val name: String
) {

}

data class Dog(
    val name: String,
    val owner: Human,
)

data class Human(
    val name: String,
)

data class DogSchool(
    val owner: Human,
    val name: String,
    val monthlyCost: Int,
    val dogs: List<Dog>
) {
    fun totalIncome(): Int = monthlyCost * dogs.size //nullsafe :D

}

/** Data classes incoporates **/

//equals()/hashCode() pair
//toString() of the form "User(name=John, age=42)"
//copy() function

/** Inheritance**/

//Implicitly inherits from Any
class Example

//Class is open for inheritance
open class Base

class Derived : Base()

/** whit args **/
open class Base2(p: Int)

class Derived2(p: Int) : Base2(p)
