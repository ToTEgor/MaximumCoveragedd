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

    @Test
    fun cardFreeVisa(){
        val cardName = "Visa"
        val lastTransfer = 0
        val amount = 500
        val res = tax(cardName = cardName, lastTransfer = lastTransfer, amount = amount)
        assertEquals(35,res)
    }

    @Test
    fun cardFreeVisatax(){
        val cardName = "Visa"
        val lastTransfer = 0
        val amount = 55500
        val res = tax(cardName = cardName, lastTransfer = lastTransfer, amount = amount)
        assertEquals(416,res)
    }

    @Test
    fun cardFreeVisataxx(){
        val cardName = "Visax"
        val lastTransfer = 0
        val amount = 55500
        val res = tax(cardName = cardName, lastTransfer = lastTransfer, amount = amount)
        assertEquals(- 2,res)
    }

    @Test
    fun VK(){
        val cardName = "VK pay"
        val lastTransfer = 20_000
        val amount = 55500
        val res = tax(cardName = cardName, lastTransfer = lastTransfer, amount = amount)
        assertEquals(- 1,res)
    }

    @Test
    fun VKpay(){
        val cardName = "VK pay"
        val lastTransfer = 1000
        val amount = 5500
        val res = tax(cardName = cardName, lastTransfer = lastTransfer, amount = amount)
        assertEquals(0,res)
    }

    @Test
    fun cardFreeMaestrotaxx(){
        val cardName = "Maestro"
        val lastTransfer = 60_000
        val amount = 0
        val res = tax(cardName = cardName, lastTransfer = lastTransfer, amount = amount)
        assertEquals(0,res)
    }

    @Test
    fun VKtax(){
        val cardName = "VK pay"
        val lastTransfer = 0
        val amount = 55500
        val res = tax(cardName = cardName, lastTransfer = lastTransfer, amount = amount)
        assertEquals(- 1,res)
    }

}