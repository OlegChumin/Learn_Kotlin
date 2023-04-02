/**
 * Функция modifyString модифицирует входную строку initialString путем выполнения различных операций над строкой,
 * таких как удаление подстрок, добавление строк, изменение порядка и замена символов. В результате получается новая
 * строка, которая выводится на экран в функции main. Отметьте, что в строках 4 и 9 есть ошибки, и операции должны быть
 * применены к переменной modifiedString.
 * */


// Функция modifyString принимает строку initialString и возвращает модифицированную строку
fun modifyString(initialString: String): String{
    // Создаем переменную modifiedString и присваиваем ей значение initialString
    var modifiedString = initialString

    // 1. Удаляем подстроку с индекса 2 по 10 (не включая) из modifiedString
    modifiedString = modifiedString.removeRange(2, 10)
    // 2. Если modifiedString содержит пробел
    if (modifiedString.contains(" "))
    // Добавляем "ABC" в конец modifiedString
        modifiedString += "ABC"
    // 3. Перемещаем подстроку после первого пробела перед подстрокой до первого пробела
    modifiedString = modifiedString.substringAfter(" ") + modifiedString.substringBefore(" ")
    // 4. Если modifiedString содержит букву "a"
    if (modifiedString.contains("a"))
    // Добавляем "1248" в конец modifiedString (ошибка, должно быть modifiedString += "1248")
        modifiedString.plus("1248")
    // 5. Заменяем первый пробел на символ "$"
    modifiedString = modifiedString.replaceFirst(" ", "$")
    // 6. Если длина modifiedString меньше 15 символов
    if (modifiedString.length < 15)
    // Разворачиваем modifiedString
        modifiedString = modifiedString.reversed()
    // 7. Добавляем "18B20" в конец modifiedString
    modifiedString += "18B20"
    // 8. Перемещаем подстроку после первой цифры "1" перед подстрокой до первой цифры "5"
    modifiedString = modifiedString.substringAfter("1") + modifiedString.substringBefore("5")
    // 9. Удаляем последние 4 символа из modifiedString (ошибка, должно быть modifiedString = modifiedString.dropLast(4))
    modifiedString.dropLast(4)

    // Возвращаем modifiedString
    return  modifiedString
}

// Функция main - точка входа в программу
fun main() {
    // Вызываем функцию modifyString с аргументом "my password is 12345" и сохраняем результат в переменной password
    val password = modifyString("my password is 12345")
    // Выводим значение переменной password на экран
    println(password)
}
