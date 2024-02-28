fun main()
{

hof3 { println("Hi $it") }


    val numbers = listOf(1,2,3,4,5)
    println(numbers.filter { numbers -> numbers >3 })


    // using with it
    println(numbers.filter { it >3 })



    //

    reverseString("Hello" ){s -> s.reversed() }  // lamda is the last parameter of paranthessis then we can
    // move it out of paranthesis

    // using it
    reverseString("Hello" ){it.reversed() }






}

fun hof3(name : (String) -> Unit)
{
    name("John")
}

fun reverseString(str: String, myLamda: (String)->(String))
{
    var result = myLamda(str)

    println(result )
}



