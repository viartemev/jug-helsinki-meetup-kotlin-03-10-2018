package com.viartemev.meetup.kotlin.demo

import arrow.core.Option
import arrow.core.Option.Companion.just

fun main(args: Array<String>) {
    just({ i: Int -> i + 1 }) apply just(1)
    just(1) apply just({ i: Int -> i + 1 })
}

@JvmName("bla1")
infix fun <A, B> Option<A>.apply(o: Option<(A) -> B>) = println("apply#1")

@JvmName("bla")
infix fun <A, B> Option<(A) -> B>.apply(o: Option<B>) = println("apply#2")


