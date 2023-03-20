/**
function funk(n):
a = 1
b = 1
x = 0
for j in [2, n - 1]:
x = a + b
a = b
b = x
return x
 */
fun main() {
    println(funk(10))
}

fun funk(n: Int):Int {
    var a = 1
    var b = 1
    var x = 0
    for (j in 2 ..n - 1) {
        x = a + b
        a = b
        b = x
    }
    return x
}