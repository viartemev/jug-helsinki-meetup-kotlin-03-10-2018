package com.viartemev.meetup.kotlin.demo

var a: String = "value"
var b: String? = "value"

fun variables() {
    b = null
    //a = null //compilation error
}

fun calls() {
    println(a.length)
    println(b?.length) //compilation error
    //Integer var2 = b != null ? b.length() : null;
    //System.out.println(var2);

    data class Street(val name: String)
    data class City(val street: Street?)
    data class UserAddress(val city: City)

    val address = UserAddress(
        City(
            Street("9th Ave")
        )
    )

    println(address.city.street?.name)
}

fun elvisOperator() {
    var str: String? = "value"
    println(str?.length)
    str = null
    println(str?.length ?: "-1")

    return str ?: throw NullPointerException()
}

fun letUsage() {
    var str: String? = "value"
    val a: String = "a"
    println(a)
    str?.let { println("The string value is: $it") }
    str = null
    str?.let { println("The string value is: $it") }
}

fun alsoUsage() {
    val str: String? = "    value   "
    str?.let { str.trim() }.also { println("The string value is: $it") }
}

fun notSoCool() {
    val str: String? = "value"
    if (str != null) {
        println(str.length)
    }

    fun isNotNull(value: Any?): Boolean = value != null
    if (isNotNull(str)) {
        //println(str.length) //compilation error
    }
}

