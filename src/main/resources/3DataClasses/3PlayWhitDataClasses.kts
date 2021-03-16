package `3DataClasses`

/** Small dog database **/
val brommaPlans = DogSchool(Human("Katja"), "Doggis", 100, listOf())

//but we want to know the total income for one DogSchool how?
println(brommaPlans.totalIncome()) //But you could
println(brommaPlans.name)

val (owner, name, montyCost, dogs) = brommaPlans //destructuring (componentX)

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