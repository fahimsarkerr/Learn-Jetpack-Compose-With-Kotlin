package com.sarker.learnwithjetpackcompose.kotlin
// Main Function
fun main(){
    /**----------------------------------------------------------
     *                 Kotlin Basics + DataType
     * --------------------------------------------------------**/
    val Name = "Fahim" // Not Changeable
    print(Name)

    var Nickname = "Sarder" // Changeable
    println("Fahim $Nickname")

    var age: Int // Use othersection
    age = 18
    println("My age is $age")

    var Height: Double = 5.7 // Complex Codding Situation
    println("My Height is $Height")

    lateinit var name: String // Later Use
    name = "Fahim Sarder"
    println("My Full Name Is " + name)

//    Array
    var MyHobie = arrayOf("Programing","Photography",617,true)
    println("My fav Think is ${MyHobie[0]} and My Hobie is ${MyHobie[1]} and My Fav Number is ${MyHobie[2]} and Iam Single ${MyHobie[3]}") // (0-1-2 Its a Number)
    println("Total ${MyHobie.joinToString()}") // joinToSting Mean Convert String.

//    Nullable Data Type
    var MyNameIs: String? = null
    println(MyNameIs)
    MyNameIs = "Fahim Sarder"
    println(MyNameIs)

//    User Input
    println("Enter Your Real Name ")
    var RealName = readln()
    print("Oh Your Name is ( $RealName ) ")
//     ListData
    var favfruit = listOf("Mango", "Banana", "Apple", "Apple")
    println(favfruit)
    println(favfruit[2])
    println(favfruit.size)
//    MutableMapData
    var StudentList = mutableMapOf("Fahim" to 1, "Fahad" to 2, "Farhan" to 3)
    println(StudentList)
    println(StudentList.get("Fahim"))
    println("Maybe Your Name is Fahim and Your Roll Number is ${StudentList.get("Fahim")}")
    StudentList.remove("Fahim")
    println(StudentList)
    /**----------------------------------------------------------
     *                  End Kotlin Basics + DataType
     * --------------------------------------------------------**/

    /**----------------------------------------------------------
     *                   Conditional Expression
     * --------------------------------------------------------**/

    println("Who is Prime Minister of Bangladesh in 2025")
    println("Option (1) D. Yunus")
    println("Option (2) Seikh Hasina")
    println("Option (3) Tarek Jia")
    println("Option (4) D. Sofficul")
    var ans = readln().toInt()

    if (ans == 1){
        println("Yes You are right")
    } else if (ans == 2){
        println("No You are not right")
    } else if (ans == 3){
        println("No You are not right")
    } else if (ans == 4){
        println("No You are not right")
    } else {
        println("Maybe you can not understand my question")
    }

    if (ans == 1) println("Yes You are right") else println("Wong -> Maybe you can not understand my question")

    when (ans) {
        1 -> println("Yes You are right")
        2 -> println("No You are not right")
        3 -> println("No You are not right")
        4 -> println("No You are not right")
        else ->  println("Maybe you can not understand my question")
    }
    /**----------------------------------------------------------
     *                 End Conditional Expression
     * --------------------------------------------------------**/

    /**----------------------------------------------------------
     *                          Loop
     * --------------------------------------------------------**/
    var TotalFruit = listOf("Mango", "Banana", "Apple", "Guava", "Watermelon")
    var Size = TotalFruit.size
    var TotalSize = 3


    for (Fruit in TotalFruit){
        println(Fruit)
    }

    for (Count in 1..Size){
        println(Count)
    }

    while (TotalSize <= Size){
        println("Total Fruit Size: $TotalSize")
        TotalSize++
    }
    /**----------------------------------------------------------
     *                        End Loop
     * --------------------------------------------------------**/

    /**----------------------------------------------------------
     *                      Null Safety
     * --------------------------------------------------------**/
    var NullSafty1: String? = null // ? Exclusive Declaration With ?
    println(NullSafty1) // Non Top Declare
    println(NullSafty1?.length) // ?. Use

    println(NullSafty1?.length ?: "No Value") // ?: Use

    println(NullSafty1!!.length) // !! Use

    var Count: Int = 5
    var NullSafty2 = String as? Int
    /**----------------------------------------------------------
     *                     End Null Safety
     * --------------------------------------------------------**/

    /**----------------------------------------------------------
     *                      Function Call
     * --------------------------------------------------------**/
    Normal()
    Parameter("Fahim")
    println(SingleExpression(5))
    println(ExplicitReturn(5))
    Generic("Fahim")
    println(Lambada("5"))
    hightorder("Fahim", Lambada)
    val p = Person("Fahim")
    p.introduce()
    val myDog = Dog()
    myDog.makeSound()
    /**----------------------------------------------------------
     *                  End Function Call
     * --------------------------------------------------------**/

}
/**----------------------------------------------------------
 *                         Function
 * --------------------------------------------------------**/
fun Normal(){
    println("Normal Function")
}
fun Parameter(Name: String){
    println("My Name is $Name")
}
fun SingleExpression(Number: Int): Int = Number * Number
fun ExplicitReturn(Number: Int): Int{
    return Number * Number
}
fun <T> Generic(Data: T){
    println("Data: $Data")
}
var Lambada: (String) -> String = { n -> "Total Number is $n"}
fun hightorder(name: String, action: (String) -> String){
    println(action(name))
}
class Person(val name: String){
    fun introduce(){
        println("Hi, my name is $name")
    }
}
//open class Animal {
//    open fun makeSound() {
//        println("Animal makes a sound")
//    }
//}
//class Dog : Animal() {
//    override fun makeSound() {
//        println("Dog barks") // this is called overriding function
//    }
//}
/**----------------------------------------------------------
 *                        End Function
 * --------------------------------------------------------**/