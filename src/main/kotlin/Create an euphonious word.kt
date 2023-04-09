/**
 * Create an euphonious word
 * All the letters of the English alphabet are divided into vowels and consonants.
 * The vowels are: a, e, i, o, u, y.
 * The remaining letters are consonants.
 *
 * A word is considered euphonious if it doesn't have three or more vowels or consonants in a row. Otherwise, it is considered discordant.
 *
 * Your task is to create euphonious words from the discordant ones. You can insert any letters inside the word. Output the minimum number of characters needed to create a euphonious word from a given word.
 *
 * For example, the word "schedule" is considered discordant because it has three consonants in a row: "sch". To create a euphonious word you need to add any vowel between 's' and 'c' or between 'c' and 'h'.
 *
 * Sample Input 1:
 *
 * schedule
 * Sample Output 1:
 *
 * 1
 * Sample Input 2:
 *
 * garage
 * Sample Output 2:
 *
 * 0
 * Sample Input 3:
 *
 * player
 * Sample Output 3:
 *
 * 1
 * Sample Input 4:
 *
 * biiiiig
 * Sample Output 4:
 *
 * 2
 * */



const val MAGIC_NUMBER_ZERO = 0
const val MAGIC_NUMBER_ONE = 1
const val MAGIC_NUMBER_THREE = 3
fun main() {
    val vowels = "aeiouy"
    val consonants = "bcdfghjklmnpqrstvwxz"
    val word = readln()
    var count = MAGIC_NUMBER_ZERO
    var prevCharType: Char? = null
    var charTypeCount = MAGIC_NUMBER_ONE

    for (char in word) {
        val isVowel = char.lowercase() in vowels
        val isConsonant = char.lowercase() in consonants

        if (prevCharType == null || isVowel && prevCharType == 'c' || isConsonant && prevCharType == 'v') {
            charTypeCount = MAGIC_NUMBER_ONE
        } else {
            charTypeCount++
            if (charTypeCount == MAGIC_NUMBER_THREE) {
                count++
                charTypeCount = MAGIC_NUMBER_ONE
            }
        }
        prevCharType = if (isVowel) 'v' else 'c'
    }

    println(count)
}