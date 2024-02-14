package `Kotlin OOP`

abstract class PersonAbstract {
    /*
    * YOU CANNOT CREATE AN INSTANCE OF ABSTRACT CLASS.
    *  AND YOU SHOULD ALSO NOT INHERIT THE FUNCTION OF THE CLASS IF YOU DO YOU HAVE TO OVERRIDE IT.
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    * */
    var age: Int = 30;

    fun displayAge () {
        println("My age is:  $age")
    }


   abstract fun displayGreetings()
}