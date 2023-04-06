import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun cardFreeMaestro(){
        val cardName = "Maestro"
        val lastTransfer = 0
        val amount = 500
        val res = tax(cardName = cardName, lastTransfer = lastTransfer, amount = amount)
        assertEquals(23,res)
    }

    @Test
    fun cardFreeVisapay() {
        val cardName = "Visa"
        val lastTransfer = 500_000
        val amount = 150_000
        val res = tax(cardName = cardName, lastTransfer = lastTransfer, amount = amount)
        assertEquals(- 1, res)
    }

    @Test
    fun cardFreeMaestrotax(){
        val cardName = "Maestro"
        val lastTransfer = 160_000
        val amount = 500_000
        val res = tax(cardName = cardName, lastTransfer = lastTransfer, amount = amount)
        assertEquals(- 1,res)
    }
}