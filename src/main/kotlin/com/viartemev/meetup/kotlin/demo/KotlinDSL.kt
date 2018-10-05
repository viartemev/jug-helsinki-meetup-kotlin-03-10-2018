package com.viartemev.meetup.kotlin.demo

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {

    val person = person {
        name = "John"
        dateOfBirth = "1980-12-01"
        addresses {
            address {
                street = "Dev Avenue"
                number = 42
                city = "Paris"
            }
            address {
                street = "Dev Avenue"
                number = 42
                city = "Paris"
            }
        }
    }
    val json = json(person)
    println(json)
    println(fromJson<Person>(json))
}

@DslMarker
annotation class PersonDsl


data class Person(
    val name: String,
    val dateOfBirth: Date,
    val addresses: List<Address>
)

data class Address(
    val street: String,
    val number: Int,
    val city: String
)

fun <T> json(json: T): String? {
    val objectMapper = ObjectMapper().registerModule(KotlinModule())
    return objectMapper.writeValueAsString(json)
}

inline fun <reified T> fromJson(json: String?): T {
    val objectMapper = ObjectMapper().registerModule(KotlinModule())
    return objectMapper.readValue(json, T::class.java)
}

fun person(block: PersonBuilder.() -> Unit): Person = PersonBuilder().apply(block).build()

@PersonDsl
class PersonBuilder {

    var name: String = ""
    private var dob: Date = Date()
    var dateOfBirth: String = ""
        set(value) {
            dob = SimpleDateFormat("yyyy-MM-dd").parse(value)
        }

    private val addresses = mutableListOf<Address>()

    fun addresses(block: ADDRESSES.() -> Unit) {
        addresses.addAll(ADDRESSES().apply(block))
    }

    fun build(): Person = Person(name, dob, addresses)

}

@PersonDsl
class ADDRESSES : ArrayList<Address>() {

    fun address(block: AddressBuilder.() -> Unit) {
        add(AddressBuilder().apply(block).build())
    }

}

@PersonDsl
class AddressBuilder {

    var street: String = ""
    var number: Int = 0
    var city: String = ""

    fun build(): Address = Address(street, number, city)

}
