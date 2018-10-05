package com.viartemev.meetup.kotlin.demo

import java.math.BigDecimal

/*
instantiate class like val period = Hours(24)
                   will be converted to -> int period = 24; (the class isn’t actually instantiated in the compiled code)
 */

inline class Latitude2(val value: BigDecimal)
inline class Longitude2(val value: BigDecimal)


fun someFun2(lat: Latitude2, lon: Longitude2) {
    println("${lat.value} and ${lon.value}")
}

fun main(args: Array<String>) {
    val lon: Longitude = 56.78.toBigDecimal()
    val lat: Latitude = 12.34.toBigDecimal()
    someFun(lon, lat)

    val lon2 = Longitude2(56.78.toBigDecimal())
    val lat2 = Latitude2(12.34.toBigDecimal())

}

interface TimeUnit {
    val value: Int
}

object Conversions {
    const val MINUTES_PER_HOUR = 60
}

inline class Hours(override val value: Int) : TimeUnit {
    val valueAsMinutes get() = value * Conversions.MINUTES_PER_HOUR
}
