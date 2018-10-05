package com.viartemev.meetup.kotlin.demo.decompile

tailrec fun factorial(step: Int, value: Int = 1): Int {
    val newValue = step * value
    return if (step == 1) newValue else factorial(step - 1, newValue)
}
