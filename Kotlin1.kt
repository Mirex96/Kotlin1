// 1. Простые мат. операции. Написать функции на каждое действие (например, функция которая
// складывает два числа итд). Изучить возможность конвертировать один тип в другой (Подсказка: <Type>.to*()).

//(+)
fun main() {
    val number1 = 12
    val number2 = 13
    sum(number1, number2)
}

fun sum(number1: Int, number2: Int) {
    val sum = number1 + number2
    println(sum)
}

//(-)
fun main() {
    val number1 = 5
    val number2 = 3
    subtraction(number1, number2)
}

fun subtraction(number1: Int, number2: Int) {
    val subtraction = number1 - number2
    println(subtraction)
}

//(*)
fun main() {
    val number1 = 7
    val number2 = 8
    multiplication(number1, number2)
}

fun multiplication(number1: Int, number2: Int) {
    val multiplication = number1 * number2
    println(multiplication)
}

//(/)
fun main() {
    val number1 = 6
    val number2 = 3
    division(number1, number2)
}

fun division(number1: Int, number2: Int) {
    val division = number1 / number2
    println(division)
}

//Конвертация
fun main() {
    val number1 = 30.21
    val number2 = 16
    conversion(number1, number2)
}

fun conversion(number1: Double, number2: Int) {
    val conversion = number1.toInt() + number2
    println(conversion)
}

//
fun main() {
    val number1 = "2"
    val number2 = 6
    conversion(number1, number2)
}

fun conversion(number1: String, number2: Int) {
    val conversion = number1.toInt() + number2
    println(conversion)

}






