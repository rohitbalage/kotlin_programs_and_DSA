package `Kotlin OOP`

open class Person (var name: String, var age: Int) {

    init {
        println("The person name: $name ")
        println("The person age: $age ")
    }

    fun talk()
    {
        println("The teacher  $name, is taking")
    }

    fun walk()
    {
        println("The teacher  $name, is walking")
    }

    fun eat()
    {
        println("$name is eating")
    }
}