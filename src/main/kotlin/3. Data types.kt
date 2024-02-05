fun main()
{
    var variablename = "rohit"


    // Byte : -128 to 127

    val b : Byte = 100

    println(b)

    // var b: Byte = 300  will give an error.


    // Short: -32786  to 32767

    val s : Short = 7000

    println(s)

    // Integer : -2147483648 to 2147483647

    val i : Int  = 99999

    println(i)

    // Long: -9223372036854775807  to 922337203685477580

    val l:  Long = 73444489L

    println(l)


    val f: Float = 3.1415F
    println(f)


    // Double

    val d: Double = 90.43434
    println(d)


    // Booleans:

    val isKotlinFun : Boolean =  true
    println(isKotlinFun)

    val isJavaFun = false
    println(isJavaFun)

    //Boolean Expressions:

    val x = 10
    val y = 5

    println(x >y)


    // Characters:

    val myGrade : Char =  'A'

    println(myGrade)


   //  val myGrade2 : Char =  66    >>>>>> In Kotlin this will produce in an error. but in Java it will print B

}