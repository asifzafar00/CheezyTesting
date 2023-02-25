package com.codesingal.cheezy_testing.utls

import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class HelpersTest {

    lateinit var helper: Helpers

    @Before
    fun isPalindrome_before() {
        //arrange
         helper=Helpers()

        //act
        val result=helper.isPalindrome("hello")

        //assert
        assertEquals(false,result)
        println("Before every test cases")

    }
    @After
    fun isPalindrome_aftrer() {
        println("After every test case")

    }


    @Test
    fun isPalindrome() {
        //arrange
        //var helper=Helpers()

        //act
        val result=helper.isPalindrome("hello")

        //assert
        assertEquals(false,result)

    }

    @Test
    fun isPalindrome_inputString_level_expectedTrue() {
        //arrange

        //act
        val result=helper.isPalindrome("level")

        //assert
        assertEquals(true,result)

    }
}