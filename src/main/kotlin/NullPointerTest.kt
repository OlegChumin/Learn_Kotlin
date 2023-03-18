fun F() {
    val a = JHelper.jF()
    a.M()  //Упс!
}

fun main() {
    F() // -> Exception in thread "main" java.lang.NullPointerException
}
