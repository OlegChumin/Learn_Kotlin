fun main() {
//    val chars = charArrayOf('H', 'Y', 'P', 'E', 'R', '-', 'S', 'K', 'I', 'L', 'L' )
//
//    val stringFromChars = String(chars)
//
//    val strings = stringFromChars.split("-")
//    println(strings[1])

    val str1 = "aaabbcccdaa"
    var str2 = " "

    for (ch in str1) {
        if (ch != str2.last()) {
            str2 += ch
        }
    }

    println(str2)

    //is palintrome
    println(readln().let { if (it == it.reversed()) "yes" else "no" })
}