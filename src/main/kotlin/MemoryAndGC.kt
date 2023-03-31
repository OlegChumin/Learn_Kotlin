import kotlin.random.Random

const val DEFAULT_ARRAY_SIZE = 1024
const val LOOP_LOW_BOUND = 0
const val LOOP_UPPER_BOUND = 1024

class ArrayOfByte(val byteArray: ByteArray) {
    companion object {
        const val DEFAULT_BYTE_ARRAY_SIZE = 1024

        fun createByteArray(byteArraySize: Int = DEFAULT_BYTE_ARRAY_SIZE): ArrayOfByte {
            val byteArray = ByteArray(byteArraySize) { Random.nextInt(Byte.MIN_VALUE.toInt(), Byte.MAX_VALUE.toInt() + 1).toByte() }
            return ArrayOfByte(byteArray)
        }
    }
}

fun fillArrayOfByteArrayElements(): Array<ArrayOfByte> {
    return Array(DEFAULT_ARRAY_SIZE) { ArrayOfByte.createByteArray() }
}

// В этом примере программа приостанавливается на 5 секунд перед и после создания массива объектов ArrayOfByte.
// Это может быть полезно, например, если вы хотите увидеть визуальное представление изменения памяти в среде разработки
// или средстве мониторинга.

fun main() {
    println("Total memory before running the program: ${getTotalMemory()}")
    println("Free memory before running the program: ${getFreeMemory()}")

    Thread.sleep(5000)

    val arrayOfByteArrayElements = fillArrayOfByteArrayElements()

    Thread.sleep(5000)

    println("Total memory after creating the bunch of the Objects: ${getTotalMemory()}")
    println("Free memory after creating the bunch of the Objects: ${getFreeMemory()}")

}

fun getTotalMemory() = Runtime.getRuntime().totalMemory()
fun getFreeMemory() = Runtime.getRuntime().freeMemory()




/**
 * В Kotlin, companion object используется для объявления статических членов класса. Это означает, что члены companion
 * object принадлежат классу, а не его экземплярам. Вы можете считать его аналогом статического блока или статических
 * полей и методов в Java.
 *
 * В предыдущем примере я использовал companion object для объявления константы DEFAULT_BYTE_ARRAY_SIZE. Это значит,
 * что DEFAULT_BYTE_ARRAY_SIZE будет доступна для всех экземпляров класса ArrayOfByte, и ее значение не будет изменяться
 * для разных экземпляров.
 * */