package com.viartemev.meetup.kotlin.demo


fun main(args: Array<String>) {
    sequenceOf(1, 2, 3)
        .filter { print("Filter $it, "); it % 2 == 1 }
        .map { print("Map $it, "); it * 2 }
        .toList()

    listOf(1, 2, 3)
        .filter { print("Filter $it, "); it % 2 == 1 }
        .map { print("Map $it, "); it * 2 }
}