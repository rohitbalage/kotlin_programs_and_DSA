

fun main()
{


    // Returning a regular function from HOF

    println(hof6()())


    // passing  a regular function to HOF

    hof7 (:: messageFun )    // the message function is not anonymous function it is normal. so we changes the braces to round.

}

fun hof6() : () -> String
{
    return :: messageFun
}

// Regular function

fun messageFun(): String
{
    return  "Hi from the Regular Function"
}

fun hof7(regFun: () ->String)
{
    println(regFun())
}