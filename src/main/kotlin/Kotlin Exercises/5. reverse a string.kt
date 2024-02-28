import java.util.*

fun main()
{
    var s1 = Scanner(System.`in`)
    println("Enter a string \n")

    var letters = s1.nextLine().toCharArray()

    println("Reverse String:")

    var reverse = ""

    for (i in letters.size-1 downTo  0)
    {
        reverse+= letters[i]
    }

    println(reverse)
}