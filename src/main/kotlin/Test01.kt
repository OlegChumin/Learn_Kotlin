fun main() {
    val b0: Byte = 2
    val s0: Short = 10
    val n0: Int = 5
    val l0: Long = 14
    val f0: Float = 11.4f

    val b: Byte = 5
//    val s: Short = 2 + b0
    val n: Int = s0.toByte() + 2
//    val l: Long = n0 + 4
    val f: Float = l0.toFloat() + 1
//    val d: Double = f0 / 1

    val someString = readlnOrNull()
    val someNumber = Integer.parseInt(readlnOrNull())
    println("Symbol # $someNumber of the string \"$someString\" is '${someString?.get(someNumber - 1)}'")

    val sequenceNumberToRead = Integer.parseInt(readlnOrNull())
//    var list: Array<Int>()
    for (i in 1 until sequenceNumberToRead) {

    }

    var count = 0
    for (i in 1 until sequenceNumberToRead) {
        if (i + 1 >= i) {
            count++;
        }
    }
}