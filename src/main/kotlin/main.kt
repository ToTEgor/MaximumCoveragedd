fun main() {

    println(tax("Visa", 0, 120_000))

}

fun tax(cardName: String, lastTransfer: Int, amount: Int): Int {
    return when (cardName) {
        "Mastercard", "Maestro" -> when {
            lastTransfer > 150_000 || lastTransfer + amount > 600_000 -> -1
            lastTransfer in 300..75000 -> 0
            else -> (amount * 0.006).toInt() + 20
        }
        "Visa", "Мир" -> when {
            lastTransfer > 150_000 || lastTransfer + amount > 600_000 -> -1
            else -> peace(amount)
        }
        "VK pay" -> when {
            lastTransfer > 15_000 || lastTransfer + amount > 40_000 -> -1
            else -> 0
        }
        else -> -2
    }
}

fun peace(amount: Int): Int {
    var tax = (amount * 0.0075).toInt()
    if (tax <= 35) return 35 else return tax
}