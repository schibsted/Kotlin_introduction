/**First**/
val hej = 2

/**kant do**/
hej = 5

/**but if you create an var you can**/
var mutable = 2
mutable = 5

/**same for function where all arguments become val**/
fun kalas(input:Int){
    input = input + 4
}

/**But instead you can reset it even if it not recommended**/
fun kalas(input:Int){
    var input = input +4
}


/**Type is set after the variable name**/

val anString: String = null
/** but we cant do like this as it needs to be set to some actual vale**/
val anStringAndValue: String = "som value"

/**but in som case we might want to have an "optional" or null variable to set later ot to know that it is empty**/
val optionalString: String? = null

/** but lets speak more about the ? and null later **/
/** Aim to only using non null variables to avoid problem**/


/**functions have different pars**/

fun //Declare that it is a function
            () //the input to the function
: String //the function return type

/** Then it uses the return to mark what to return **/

{
    return "Something"
}

/** simplified functions, to make functions smaller and compacter there is a function to have a one liner**/

//single-expression function

fun oneLiner(number:Int) : String = number.toString() + " number of people"

/**how to call function**/
println(oneLiner(5))

/** Where you could have one line but mor on those later **/

/** default values :D **/

fun defualtValues(number: Int, whitDefualt:Int = 4)
/** if no values is provided **/

/** named arguments**/

defualtValues(whitDefualt = 10, number = 3)
/**Write them in any order and the default could be in the middle**/

val person = Person("x", "y", "z")
val (n, s, i) = person
