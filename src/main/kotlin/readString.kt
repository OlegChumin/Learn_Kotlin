fun main() {
    print("Ведите текст ")
    val Text = readln()
    val stringBuilder: java.lang.StringBuilder = java.lang.StringBuilder(Text)
    if (stringBuilder[0] == 'i') {
        println(stringBuilder.delete(0, 1).toString().toInt() + 1)
    } else if (stringBuilder[0] == 's') {
        println(stringBuilder.delete(0, 1).reverse())
    } else println(Text)

}