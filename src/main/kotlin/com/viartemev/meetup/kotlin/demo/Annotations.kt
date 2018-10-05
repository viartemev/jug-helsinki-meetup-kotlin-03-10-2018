package com.viartemev.meetup.kotlin.demo

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.ObjectMapper

@Target(
    AnnotationTarget.CLASS, AnnotationTarget.FUNCTION,
    AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.EXPRESSION
)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class Fancy

fun main(args: Array<String>) {
    val json = """
        {
            "a":111,
            "b":222
        }
        """.trimIndent()
    println(json.toObject<Foo>())

}

data class Foo @JsonCreator constructor(
    @JsonProperty("a") val a: Int,
    @JsonProperty("b") val b: Int
)

inline fun <reified T : Any> String.toObject(): T {
    val mapper = ObjectMapper()
    return mapper.readValue(this, T::class.java)
}
