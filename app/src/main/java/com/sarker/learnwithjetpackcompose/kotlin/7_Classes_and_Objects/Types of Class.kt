package com.example.kotlinseriestrial.`7_Classes_and_Objects`

// Types of Classes in Kotlin (Kotlin offers different types of classes depending on use cases).


// 1. Data Class Used to store data, and automatically provides useful methods like toString(), copy(), equals(), etc.


//data class User(val name: String, val age: Int)
//
//fun main() {
//    val user1 = User("Shivam", 23)
//    val user2 = User("Shivam", 23)
//    println(user1)  // Output: User(name=Shivam, age=23)
//    println(user2)  // Output: User(name=Shivam, age=23)
//}



//  2. Enum Class (Used for defining constant values).

//
//enum class Day{
//    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
//}
//
//fun main() {
//    val day = Day.Monday
//    println(day)  // Output: Monday
//}





// 3. Sealed Class (A sealed class is like an enum but with more flexibility, used for defining restricted hierarchies.)

//
//sealed class Shape{
//    class Circle(val radius: Double): Shape()
//    class Rectangle(val width: Double, val height: Double): Shape()
//
//    class Square(var side: Double): Shape()
//}
//
//fun printshape(Shape: Shape) {
//    when (Shape) {
//        is Shape.Circle -> println("Circle with radius ${Shape.radius}")
//        is Shape.Rectangle -> println("Rectangle with width ${Shape.width} and height ${Shape.height}")
//        is Shape.Square -> println("Square with side ${Shape.side}")
//
//    }
//}
//
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

//abstract class Animal {
//    abstract fun makeSound()
//}
//
//class Dog : Animal() {
//    override fun makeSound() {
//        println("Dog barks")
//    }
//}
//
//fun main() {
//    val d = Dog()
//    d.makeSound()
//}
// Use case: When you want to enforce a common behavior in child classes.


// 5. Singleton Object (Single Instance) A singleton is a class that can have only one instance.

//object Database {
//    fun connect() {
//        println("Connected to the database")
//    }
//}
//
//fun main() {
//    Database.connect()
//}
