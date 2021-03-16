//Get a nullPointerException


data class Brand (val name:String)
data class Car (val brand:Brand?)
val car = Car(null)
// Get the car name or if null the string "non" nullsafe




//examples further down


























































var nullably:String? = null

println(nullably!!.length)