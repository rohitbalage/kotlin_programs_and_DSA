import java.util.Scanner

fun main()
{

    var s1 = Scanner(System.`in`)

    println("Enter the numbers ")

    var s2 = s1.nextInt()

    var s3 = s1.nextInt()

    var s4 = s1.nextInt()

   if(s2 > s3 &&  s2> s4)
   {
       println(" $s2 is the gratest number")
   }

    else if(s3 > s2 &&  s3> s4)
    {
        println("$s3 is the greatest number")
    }
    else
   {
       println("$s4 is the greatest number")
   }

}