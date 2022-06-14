import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun SummaMonthMaxSumPerevodMax() {
        val card = "мир"
        val summaMonth = 160000001
        val sumPerevod = 150000001
        val result = calculationCommission(card, summaMonth, sumPerevod)
        assertEquals(-1,result)
    }


    @Test
    fun SummaMonthNormSumPerevodMax() {
        val card = "мир"
        val summaMonth = 60000000
        val sumPerevod = 150000001
        val result = calculationCommission(card, summaMonth, sumPerevod)
        assertEquals(-1,result)
    }

    @Test
    fun SummaMonthNormSumPerevodNorm() {
        val card = "мир"
        val summaMonth = 60000000
        val sumPerevod = 150000000
        val result = calculationCommission(card, summaMonth, sumPerevod)
        assertEquals(92000,result)
    }

    @Test
    fun SummaMonthMaxSumPerevodNorm() {
        val card = "мир"
        val summaMonth = 60000001
        val sumPerevod = 150000000
        val result = calculationCommission(card, summaMonth, sumPerevod)
        assertEquals(-1,result)
    }
    @Test
    fun mirCalculationSummaMonthMin() {
        val card = "мир"
        val summaMonth = 70
        val sumPerevod = 150000001
        val result = calculationCommission(card, summaMonth, sumPerevod)
        assertEquals(-1,result)
    }

    @Test
    fun mirSummaMonthResult() {
        val card = "мир"
        val summaMonth = 16000001
        val sumPerevod = 3600000
        val result = calculationCommission(card, summaMonth, sumPerevod)
        assertEquals(23600,result)
    }

    @Test
    fun vkPaySummaMonthMax() {
        val card = "vkPay"
        val summaMonth = 16000001
        val sumPerevod = 3600000
        val result = calculationCommission(card, summaMonth, sumPerevod)
        assertEquals(-1,result)
    }

    @Test
    fun vkPayCommission0() {
        val card = "vkPay"
        val summaMonth = 160001
        val sumPerevod = 360000
        val result = calculationCommission(card, summaMonth, sumPerevod)
        assertEquals(0,result)
    }

    @Test
    fun masterCardMin35() {
        val card = "mastercard"
        val summaMonth = 3400
        val sumPerevod = 3400
        val result = calculationCommission(card, summaMonth, sumPerevod)
        assertEquals(3500,result)
    }
    @Test
    fun masterCardMax35() {
        val card = "mastercard"
        val summaMonth = 36000
        val sumPerevod = 36000
        val result = calculationCommission(card, summaMonth, sumPerevod)
        assertEquals(3500,result)
    }

    @Test
    fun noNameCard() {
        val card = "1"
        val summaMonth = 36000
        val sumPerevod = 36000
        val result = calculationCommission(card, summaMonth, sumPerevod)
        assertEquals(-1,result)
    }
    @Test
    fun vkPayMax() {
        val card = "vkPay"
        val summaMonth = 36000
        val sumPerevod = 4000001
        val result = calculationCommission(card, summaMonth, sumPerevod)
        assertEquals(-1,result)
    }

    @Test
    fun vkPaySumPerevodMax() {
        val card = "vkPay"
        val summaMonth = 36000
        val sumPerevod = 1500001
        val result = calculationCommission(card, summaMonth, sumPerevod)
        assertEquals(-1,result)
    }
    @Test
    fun vkPaySummaMonthMaxNo() {
        val card = "vkPay"
        val summaMonth = 4000001
        val sumPerevod = 1500000
        val result = calculationCommission(card, summaMonth, sumPerevod)
        assertEquals(0,result)
    }

}