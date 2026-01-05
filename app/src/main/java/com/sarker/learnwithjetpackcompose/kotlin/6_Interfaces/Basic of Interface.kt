package com.example.kotlinseriestrial.`6_Interfaces`

/*

  1. What is an Interface?
    An interface in Kotlin is a blueprint for a class that defines what a class should do, but not how.
    It is similar to an abstract class but:

    Cannot store state (i.e., no instance variables).
    Only provides method declarations (though it can have method implementations).
    A class can implement multiple interfaces (Unlike inheriting from only one class).
    Think of an interface like a contract – if a class implements an interface,
    it must follow the rules set by the interface.

 */





// 2. How to create Interface



interface MakeSound{
    fun makeSound()
}


// 3. How to implement Interface in class

class Man : MakeSound {
    override fun makeSound() {
        println("Ha,Ha,Ha,Ha,Ha")
    }
}

fun main() {
    val Human = Man()
    println("Man Sound")
    Human.makeSound()
    println("I am Right!")
}




