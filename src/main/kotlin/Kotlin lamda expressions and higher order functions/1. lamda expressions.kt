package `Kotlin lamda expressions and higher order functions`/*
*
* Lamda expressions:
*Lamda expresssion is a short way to create a function. To define a lamda expression,
* enclose the method body inside braces
*
*fun addTwoNum (x : Int, y : Int) : Int {
* return x +y
*  }
*
that is equivalent to ::

{ x, y -> x + y}



There are two ways to execute the lambd:

Add parentheses after the variable name
call invode() method

var printWelcome = { println ("Welcome to Our Course"}
printWelcome()
printWelcome.invoke()

*
*
* */