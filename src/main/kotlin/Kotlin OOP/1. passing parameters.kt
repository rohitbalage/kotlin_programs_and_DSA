
fun main()
{

    myFuntion("Jack", 26)
  var result =  addToNUmbers(5, 7)

    println(result)
}


// arguments must passed in the same order  and with same data type

fun myFuntion(fname : String, age : Int)
{
    println("hello my friend "+fname + " and your name is " +age)
}

// function with return

fun addToNUmbers (x:  Int, y: Int) : Int {

    return (x+y)
}