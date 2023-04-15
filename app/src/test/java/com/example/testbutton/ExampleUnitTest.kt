package com.example.testbutton

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generateNumber() {
        val dice = Dice(6)
        val rollResult = dice.roll()
        assertTrue("value arent in range 1..6", rollResult in 1..6)
    }
}