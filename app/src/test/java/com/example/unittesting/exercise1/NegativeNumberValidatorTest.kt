package com.example.unittesting.exercise1

import org.hamcrest.core.Is
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class NegativeNumberValidatorTest {

    private lateinit var SUT: NegativeNumberValidator

    @Before
    fun setup(){
        SUT = NegativeNumberValidator()
    }

    @Test
    fun test1() {
        val result = SUT.isNegative(-1)
        Assert.assertThat(result, Is.`is`(true))
    }

    @Test
    fun test2() {
        val result = SUT.isNegative(0)
        Assert.assertThat(result, Is.`is`(false))
    }

    @Test
    fun test3() {
        val result = SUT.isNegative(1)
        Assert.assertThat(result, Is.`is`(false))
    }
}