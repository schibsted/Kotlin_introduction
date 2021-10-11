//print the name of the brand

//Get a nullPointerException


data class Brand (val name:String)
data class Car (val brand:Brand?)
val car = Car(null)



//examples further down








































//print the brand name nullsafe
println(car.brand?.name)

//print the brand name nullsafe or "non" if missing
println(car.brand?.name ?: "non")

//get nullPointerException
var nullably:String? = null
println(nullably!!.length)