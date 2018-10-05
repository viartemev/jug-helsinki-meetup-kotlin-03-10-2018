package com.viartemev.meetup.kotlin.demo

import java.math.BigDecimal

typealias Latitude = BigDecimal
typealias Longitude = BigDecimal

fun someFun(lat: Latitude, lon: Longitude) {
    println("$lat and $lon")
}

fun main(args: Array<String>) {
    val lon: Longitude = 56.78.toBigDecimal()
    val lat: Latitude = 12.34.toBigDecimal()
    someFun(lat, lon)
}
