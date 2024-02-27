import java.util.Scanner

fun main()
{
    var v1 = Scanner(System.`in`)



    println("Enter the numbers: ")

    var v3 = v1.nextInt()
    var v2 = v1.nextInt()

    var temp = v3
    v3 = v2
    v2 =temp


    println("The swapped numbers are $v3 and $v2")
}