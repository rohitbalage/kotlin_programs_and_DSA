

fun main()
{
// types of anonymous functions

    // with parameters and return value

    val multiply = fun(a:Int, b:Int): Int {return  a*b}
    println(multiply.invoke(4,5))


    // with parameters and no return value

    val multiiply2 = fun(a: Int, b:Int): Unit { println("" +a*b) }
    multiiply2(4,5)


    // no parameters and return value

    val msg = fun() : String {return  "Welcome to our repository"}
    println(msg())


    // no parameters and no return value

    val msg2 = fun(): Unit { println("Welcome again") }

    msg2()

}