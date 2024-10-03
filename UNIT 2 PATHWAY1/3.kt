fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when {
        age < 0 || age > 100 -> -1  // Độ tuổi không hợp lệ
        age < 12 -> 15               // Trẻ em dưới 12 tuổi
        age in 13..60 -> {
            if (isMonday) 25 else 30 // Giảm giá vào thứ Hai cho người từ 13 đến 60 tuổi
        }
        age >= 61 -> 20              // Người cao tuổi từ 61 tuổi trở lên
        else -> -1                   // Mặc định, nếu không vào bất kỳ trường hợp nào
    }
}
