//Create a class structure for a dictionary that, at a minimum, should contain dictionary, words and word language for each word

//Solving ide further down




















































data class dictionary(
    val words:List<Word>,
    val name:String
)

data class Word(
    val word:String,
    val language:Language
)

data class Language(
    val name:String,
    val continent:String
)
