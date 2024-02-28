/*
* Anonymous function: a function without name
*
*
* val variableName : (Datatype1, Datatype2) -> ReturnType = fun(parameter1, parameter2): ReturnType {methodBody}
*
*
* */


fun main()
{
    val add : (Int, Int) -> Int = fun (a,b) : Int { return a+b }


    println(add(2,5))

    // OR MORE SHORTER FORM

    val add2 = fun(a: Int, b: Int): Int {return  a+b }

    println(add2(2,5))

    // Note: If the method body has only one statement,
    // we can omit the return keyword and the braces

    val add3 = fun(a: Int, b : Int) : Int = a+b

    println(add3(2,5))

}
