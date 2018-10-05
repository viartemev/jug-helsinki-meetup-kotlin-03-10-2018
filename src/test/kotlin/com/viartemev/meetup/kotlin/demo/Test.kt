package com.viartemev.meetup.kotlin.demo

import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.Timeout
import java.util.concurrent.TimeUnit as Unit


class MyTest {
    @get:Rule
    var timeout = Timeout(2L, Unit.MILLISECONDS)

    class State(val data: String)

    lateinit var state: State

    @Before
    fun setUp() {
        state = MyTest.State("12345")
    }

    @Test
    fun `Displays success screen when creating a user with all fields valid`() {
        // the test
    }

}