package com.example.unittesting.example1

import org.hamcrest.core.Is.`is`
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class PositiveNumberValidatorTest {

    private lateinit var SUT: PositiveNumberValidator

    @Before
    fun setup(){
        SUT = PositiveNumberValidator()
    }

    @Test
    fun test1() {
        val result = SUT.isPositive(-1)
        Assert.assertThat(result, `is`(false))
    }

    @Test
    fun test2() {
        val result = SUT.isPositive(0)
        Assert.assertThat(result, `is`(false))
    }

    @Test
    fun test3() {
        val result = SUT.isPositive(1)
        Assert.assertThat(result, `is`(true))
    }
}