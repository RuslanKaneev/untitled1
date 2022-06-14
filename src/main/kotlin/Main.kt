fun main() {
    println(calculationCommission("мир", 60000000, 15000000))
}

fun calculationCommission(card: String = "vkPay", summaMonth: Int = 0, sumPerevod: Int): Int {
    return if (summaMonth > 60000000 || sumPerevod > 15000000)
        -1;
    else {
        when (card) {
            "vkPay" -> if (summaMonth > 4000000 || sumPerevod > 1500000) -1 else 0
            "visa", "мир" -> if (summaMonth < 75000 * 100) 0 else (sumPerevod * 0.006 + 20 * 100).toInt()
            "mastercard", "maestro" -> if (sumPerevod * 0.0075 <= 3500) 3500 else (sumPerevod * 0.0075).toInt()
            else -> -1
        }
    }
}