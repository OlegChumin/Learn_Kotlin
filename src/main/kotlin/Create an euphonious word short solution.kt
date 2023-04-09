fun main() = println(Regex("([aeiouy]{3,}|[bcdfghjklmnpqrstvwxz]{3,})")
    .findAll(readln())
    .sumOf { (it.value.length - 1) / 2 })