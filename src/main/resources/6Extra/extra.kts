/**String template**/
var a = 1
/** simple name in template:**/
val s1 = "a is $a"

a = 2
/** arbitrary expression in template:**/
val s2 = "${s1.replace("is", "was")}, but now is $a"




/** when expression**/

fun describe(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }