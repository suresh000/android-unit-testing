package com.android.unit.testing.utils

import org.junit.After
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class HelperTest {

    private lateinit var mHelper: Helper

    @Before
    fun setUp() {
        mHelper = Helper()
    }

    @After
    fun tearDown() {
        println("After Every Test Case")
    }

    @Test
    fun isPalindrome_input_hello_expected_false() {
        // Arrange
        //val helper = Helper()

        // Act
        val result = mHelper.isPalindrome("hello")

        // Assert
        assertEquals(false, result)
    }

    @Test
    fun isPalindrome_input_level_expected_true() {
        // Arrange
        val helper = Helper()

        // Act
        val result = helper.isPalindrome("level")

        // Assert
        assertEquals(true, result)
    }
}