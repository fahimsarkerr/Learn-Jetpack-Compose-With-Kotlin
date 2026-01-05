package com.sarker.learnwithjetpackcompose.kotlin

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**----------------------------------------------------------
 *                         Interface
 * --------------------------------------------------------**/

// Interface with Default Methods
interface MakeSound{
    fun makeSound()
}
// 3. How to implement Interface in class
class Man : MakeSound {
    override fun makeSound() {
        println("Ha,Ha,Ha,Ha,Ha")
    }
}
// No need to override unless you want custom behavior
interface Animal {
    fun makeSound() {
        println("Some generic animal sound") // Default implementation
    }
}
class Cat : Animal {  // No need to override unless you want custom behavior

}

// Implementing Multiple Interfaces
//  A class can implement multiple interfaces, unlike class inheritance.
// Example: Multiple Interfaces

interface Engine {
    fun start() {
        println("Engine started")
    }
}

interface Wheels {
    fun roll() {
        println("Wheels are rolling")
    }
}

class car : Engine, Wheels  // Implements both interfaces
//fun main() {
//    val Car = car()
//    Car.start()  // From Engine interface
//    Car.roll()   // From Wheels interface
//}

//  Handling Conflicts in Interfaces
//  If multiple interfaces have the same method, you must explicitly override it.
//  Example: Resolving Interface Conflict

interface A {
    fun show() {
        println("Interface A")
    }
}

interface B {
    fun show() {
        println("Interface B")
    }
}

class C : A, B {
    override fun show() {
        super<A>.show()  // Explicitly calling A's method
    }
}
//
//fun main() {
//    val obj = C()
//    obj.show()
//}

//Since A and B both have show(), we explicitly specify which one to use.
/**----------------------------------------------------------
 *                     End Interface
 * --------------------------------------------------------**/

/**----------------------------------------------------------
 *                          Class
 * --------------------------------------------------------**/

class User{
    fun Name(){
        println("Fahim Sarder")
    }
}

// 1. Primary Constructor (A primary constructor is declared in the class header using the constructor keyword.)
class Student(val name: String, val age: Int) {
    fun display() {
        println("Student Name: $name, Age: $age")
    }
}
//
//fun main() {
//    val s = Student("Fahim", 18+) // Passing arguments to the constructor
//    s.display()
//}

// 2. Secondary Constructor (A secondary constructor is declared inside the class body using constructor keyword.)
class Employee {
    var name: String
    var age: Int

    // Secondary Constructor
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    fun display() {
        println("Employee Name: $name, Age: $age")
    }
}
//
//fun main() {
//    val e = Employee("Amit", 30)
//    e.display()
//}

// 3. init Block (For Extra Initialization)
//The init block is executed as soon as the object is created, before any other functions run.

class Car(val brand: String, val model: String) {

    init {
        println("The Car $brand $model is created!")
    }
}
//
//fun main() {
//    val c = Car("Tesla", "Model X")
//}

// Types of Classes in Kotlin (Kotlin offers different types of classes depending on use cases).

// 1. Data Class Used to store data, and automatically provides useful methods like toString(), copy(), equals(), etc.

data class user(val name: String, val age: Int)

//fun main() {
//    val user1 = user("Fahim", 18)
//    val user2 = user("Fahim", 18)
//    println(user1)  // Output: User(name=Shivam, age=23)
//    println(user2)
//}

//  2. Enum Class (Used for defining constant values).

enum class Day{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

//fun main() {
//    val day = Day.Monday
//    println(day)  // Output: Monday
//}

// 3. Sealed Class (A sealed class is like an enum but with more flexibility, used for defining restricted hierarchies.)

sealed class Shape{
    class Circle(val radius: Double): Shape()
    class Rectangle(val width: Double, val height: Double): Shape()

    class Square(var side: Double): Shape()
}

fun printshape(Shape: Shape) {
    when (Shape) {
        is Shape.Circle -> println("Circle with radius ${Shape.radius}")
        is Shape.Rectangle -> println("Rectangle with width ${Shape.width} and height ${Shape.height}")
        is Shape.Square -> println("Square with side ${Shape.side}")

    }
}

//fun main() {
//    val circle = Shape.Circle(5.0)
//    val rectangle = Shape.Rectangle(4.0, 6.0)
//    val square = Shape.Square(3.0)
//
//    printshape(circle)
//    printshape(rectangle)
//    printshape(square)
//}

// 4. Abstract Class An abstract class cannot be instantiated and must be inherited.

abstract class PetAnimal {
    abstract fun makeSound()
}

class Dog : PetAnimal() {
    override fun makeSound() {
        println("Dog barks")
    }
}

fun main() {
    val d = Dog()
    d.makeSound()
}
// Use case: When you want to enforce a common behavior in child classes.

// 5. Singleton Object (Single Instance) A singleton is a class that can have only one instance.

object Database {
    fun connect() {
        println("Connected to the database")
    }
}
//
//fun main() {
//    Database.connect()
//}
/**----------------------------------------------------------
 *                      End Class
 * --------------------------------------------------------**/

/**----------------------------------------------------------
 *                      OOP Concepts
 * --------------------------------------------------------**/
// Full Concept Clear in 8 Module
/*
  Object-Oriented Programming (OOP) consists of four fundamental principles:

  1. Abstraction – Hiding implementation details
  2. Encapsulation – Restricting direct access to data
  3. Polymorphism – One function, multiple forms
  4. Inheritance – Reusing properties and behaviors

 */
/**----------------------------------------------------------
 *                    End OOP Concepts
 * --------------------------------------------------------**/

/**----------------------------------------------------------
 *                      OOP Concepts
 * --------------------------------------------------------**/
// Full Concept Clear in 9 Module and Jetpack Compose Ui Course
/**----------------------------------------------------------
 *                    End OOP Concepts
 * --------------------------------------------------------**/

/**----------------------------------------------------------
 *                       Coroutines
 * --------------------------------------------------------**/
/*
fun main() = runBlocking { // this: CoroutineScope
    launch { // launch a new coroutine and continue
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!") // print after delay
    }
    println("Hello") // main coroutine continues while a previous one is delayed
}
*/
// --------------------- Coroutines Implementation ----------------------- //
/*
fun main() = runBlocking { // this: CoroutineScope
    launch { network() }
    println("Hello")
}

// this is your first suspending function
suspend fun network() {
    delay(1000L)
    println("World!")
}
*/