

fun main()
{
// 1- with parameters and return value

    val add1 : (Int, Int) -> Int = {a: Int, b: Int -> a+b}
    println((add1(10,20)))

    // 2 - with parameters & no return values:

    val add2: (Int ,Int) -> Unit = {a,b -> println(a+b) }

    add2(40, 30)

    // 3 - No parameters but with return value

    val add3 : () -> String = {"Welcome to our course"}
    println(add3())  // or we can use add3.invoke()


    // 4 - No Parameterss & No Returning values

    val add4: () -> Unit = { println("Welcome Again") }

    add4.invoke()

}