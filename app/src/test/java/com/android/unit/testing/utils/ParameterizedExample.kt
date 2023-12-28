package com.android.unit.testing.utils

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(value = Parameterized::class)
class ParameterizedExample(private val input: String,
                           private val expected: Boolean) {

    @Test
    fun test() {
        val helper = Helper()
        val result = helper.isPalindrome(input)
        Assert.assertEquals(expected, result)
    }

    companion object {

        @JvmStatic
        @Parameters(name = "{index} : {0} is palindrome - {1}")
        fun data() : List<Array<Any>> {
            return listOf(
                arrayOf("hello", false),
                arrayOf("level", true),
                arrayOf("a", true),
                arrayOf("", true)
            )
        }

    }

}