package com.example.unittesting.example2

import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class StringReverserTest {

    private lateinit var SUT: StringReverser

    @Before
    @Throws(Exception::class)
    fun setup() {
        SUT = StringReverser()
    }

    @Test
    @Throws(Exception::class)
    fun reverse_emptyString_emptyStringReturned() {
        val result = SUT.reverse("")
        Assert.assertThat(result, CoreMatchers.`is`(""))
    }

    @Test
    @Throws(Exception::class)
    fun reverse_singleCharacter_sameStringReturned() {
        val result = SUT.reverse("a")
        Assert.assertThat(result, CoreMatchers.`is`("a"))
    }

    @Test
    @Throws(Exception::class)
    fun reverse_longString_reversedStringReturned() {
        val result = SUT.reverse("Vasiliy Zukanov")
        Assert.assertThat(result, CoreMatchers.`is`("vonakuZ yilisaV"))
    }
}