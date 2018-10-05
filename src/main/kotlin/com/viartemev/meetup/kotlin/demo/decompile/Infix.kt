package com.viartemev.meetup.kotlin.demo.decompile

infix fun Int.plus(value: Int): Int {
    return this + value
}

class Test {
    fun test() {
        val result = 5 plus 3
    }
}
