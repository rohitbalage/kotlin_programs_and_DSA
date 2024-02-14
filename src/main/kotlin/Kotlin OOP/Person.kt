package `Kotlin OOP`


// age is a default value:
open class Person (var name: String, var age: Int =0) {



    // Secondary Constructor
    /*
    constructor(name: String, age: Int): super(name, age)

    print("Secondary constructor is being used")
     */

    var name2: String = "Jack"
    private var age2 = 10   // can not access coz it is private
    protected  var haircolor = "Black"  // protected is visible to derived and base classes.
    internal  var   skintone = "Brown"  // invisible to any client inside the module for class.


    /*



    is equivalent to :

    get()  = field  // getter
    set(value)  { filed = value }  // setter

        */



    init {
        println("The person name: $name ")
        println("The person age: $age ")
        println("We used the initializer")
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