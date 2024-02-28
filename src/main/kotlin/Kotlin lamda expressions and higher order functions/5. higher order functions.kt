/*
* Higher order functions:
*
* It a function that takes a function as parameter or return a function or both
*
*
* In general, lamda expression are passed as an argument to a higher-order function or returned
* argument to a higher-order function or returned from it. we can also use anonymous functions for
* the same.
*
*
* */


fun main()
{

    val add = {a: Int, b: Int  -> a+b}
    hof(add)  // calling higher order function  of hof{a: Int, b:Int, Int -> a+n}

    hof2("Jack", {a: Int, b: Int  -> a+b} )  //
}

// Higher order functions

fun hof(addition: (Int, Int) -> Int)
{
    val result = addition(4,5)
    println(result)

}

fun hof2(name: String, addition: (Int, Int) -> Int)
{
   val result = addition(4,5)
    println("Hello $name : " +result)
}