import java.util.Scanner

fun main()
{
    var s1 = Scanner(System.`in`)
    print("please enter a number")

    var x = s1.nextInt()

    print("please enter second number")

    var y = s1.nextInt()

    var result = x / y
    var remainder = x % y

    print("The result = $result and the remainder is $remainder")
}