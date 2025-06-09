package io.ksw.S17

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class c(val name: String, val color: String, val size: Int) {
    inner class Bow(val color: String, val size: Int) {
        fun printColor() {
            println("$name $color")
            println("$name $size")
            println("$name ${this.color}")
            println("$name ${this.size}")
        }
    }
}

fun main() {

    var firstName:String? = null
    var lastName = firstName
    firstName = "John"
    print("${firstName?.length} ${lastName?.length}")
}