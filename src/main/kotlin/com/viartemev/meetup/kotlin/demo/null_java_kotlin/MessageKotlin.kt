package com.viartemev.meetup.kotlin.demo.null_java_kotlin

fun main(args: Array<String>) {
    val str: String? = "value"
    val message = Message()
    val nullableEchoMessage: String? = message.echoMessage // allowed, always works
    val nonnullableEchoMessage: String = message.echoMessage // allowed, may fail at runtime
    val echoMessage = message.echoMessage
    // println(echoMessage.length)
    // message.doSomething(str)
    // message.doWithCustomAnnotation(str)
}