
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}

// Define add() function below this line
fun add(a: Int, b: Int): Int{
    return a + b;
}

fun subtract(a: Int, b: Int): Int{
    return a - b;
}
