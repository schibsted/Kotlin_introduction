/** Everything is nullsafe by default **/

val nullSafe: Int = 3

val nullsafe2 Int = null //Wont work

/** Things that could be null **/

val couldBeNull: Int? = null
val couldBeNull2: Int? = 2 //still works

/** !! make non null of null variable**/

val nullValue: String? = "Something"

val nonNullValue: String = nullValue //Wont work as it could be null
val nonNullValue2: String = nullValue!! //Then we say that this wont be null (could throw nullpointExeption)

val nonNullValue3: String = nullValue ?: "other" //If it is null than take the other instead :D

data class Brand (val name:String)
data class Car (val brand:Brand?)
val car = Car(null)

val nonNullValue4: String = car.brand.name //wont work as brand could be null
val nonNullValue4: String? = car.brand?.name //If brand is null than we wont do this value but return null instead



/**types**/

Any //like java object

Int
Short
Byte
Long

String

