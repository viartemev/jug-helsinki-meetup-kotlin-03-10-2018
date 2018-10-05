package com.viartemev.meetup.kotlin.demo.decompile

data class TestObj(val argumentValue: String, val argumentValue2: String) {
    var innerValue: Int = 0
}

class DestructuringDeclaration {
    fun test() {
        val (one, two) = TestObj("hello", "world")
    }

}
