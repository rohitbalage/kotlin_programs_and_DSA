package `Kotlin OOP`

interface vehical {
    val speedValue: Int


    fun startEngine() : String

    /*
    *  The above function is expecting a string and that is why it should be overriding in child class
    * also knowing that it should only ask when it has no body here
    *
    * like here below the function acceleration  we have defined the body here:
    * */

    fun accelerate()
    {
        println("Accelerating.........")
    }
}