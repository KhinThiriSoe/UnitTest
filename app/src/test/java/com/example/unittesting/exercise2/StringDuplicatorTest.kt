package com.example.unittesting.exercise2

import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class StringDuplicatorTest {

    private lateinit var SUT: StringDuplicator

    @Before
    @Throws(Exception::class)
    fun setup() {
        SUT = StringDuplicator()
    }

    @Test
    @Throws(Exception::class)
    fun duplicate_emptyString_duplicatedEmptyStringReturned() {
        val result = SUT.duplicate("")
        Assert.assertThat(result, CoreMatchers.`is`(""))
    }

    @Test
    @Throws(Exception::class)
    fun duplicate_singleCharacter_duplicatedSameStringReturned() {
        val result = SUT.duplicate("a")
        Assert.assertThat(result, CoreMatchers.`is`("aa"))
    }


    @Test
    @Throws(Exception::class)
    fun duplicate_longString_duplicatedStringReturned() {
        val result = SUT.duplicate("aaa")
        Assert.assertThat(result, CoreMatchers.`is`("aaaaaa"))
    }
}