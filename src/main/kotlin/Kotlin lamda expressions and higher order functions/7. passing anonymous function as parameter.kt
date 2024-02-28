fun main()
{


    // Passing anonymous function to a parameter to HOF

    val subtr = fun(a:Int, b:Int):Int {
        return a-b
    }

    hof4(subtr)

    // Returning a value from an anonymous function
   println(hof5()())

}

fun hof4 (subtract: (Int,Int) -> Int)
{
    val result = subtract(77,10)
    println("Substraction result:  $result")
}

fun hof5 () : () -> String{
    val msg = fun():String{
        return "Hi from HOF5"
    }
    return  msg
}
