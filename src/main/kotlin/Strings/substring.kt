package Strings

fun main() {
    val example = "Example"
    print("Line #1")
    println(example.substring(3))  //1
    print("Line #2")
    println(example.substring(0, 7))      // 2
    print("Line #3")
//    println(example.substring(-1, 0)) // 3
    //Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -1
    print("Line #4")
    println(example.substring(0, 0))  // 4
    print("Line #5")
//    println(example.substring(0, 8))  // 5
//    Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 8
    println()

    val hello = "Hello world"
    println(hello.replace("Hello ", ""))
}
