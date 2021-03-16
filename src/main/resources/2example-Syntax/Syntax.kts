/**First**/
val hej = 2

/**can't do this**/
hej = 5

/**but if you create a var you can**/
var mutable = 2
mutable = 5

/**same for a function, where all arguments become val**/
fun kalas(input:Int){
    input = input + 4
}

/**Instead you can reset it, even if it not recommended**/
fun kalas(input:Int){
    var input = input +4
}


/**Type is set after the variable name**/

val anString: String = null
/** but we can't do it like this as it needs to be set to some actual value**/
val anStringAndValue: String = "som value"

/**In some case we might want to have an "optional" or null variable to set later, in order to know that it is empty**/
val optionalString: String? = null

/** We'll return to the ? and null later on **/
/** Aim to only using non-null variables to avoid problems**/


/**functions have different pars**/

fun //Declare that it is a function
            () //the input to the function
: String //the function return type

/** Then it uses the return to mark what to return **/

{
    return "Something"
}

/** simplified functions, to make functions smaller and more cpmpact, there is a function to have a one liner**/

//single-expression function

fun oneLiner(number:Int) : String = number.toString() + " number of people"

/**how to call function**/
println(oneLiner(5))

/** Where you could have one line but more on those later **/

/** default values :D **/

fun defualtValues(number: Int, whitDefualt:Int = 4)
/** if no values is provided **/

/** named arguments**/

defualtValues(whitDefualt = 10, number = 3)
/**Write them in any order and the default could be in the middle**/

val person = Person("x", "y", "z")
val (n, s, i) = person
