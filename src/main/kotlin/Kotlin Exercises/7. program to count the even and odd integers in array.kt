


fun main()
{
 var nums = arrayOf(5,3,2,6,1)

 var even_counter =0

 var odd_counter = 0

 for (i in nums)
 {
     if (i % 2 ==0)
     {
         even_counter++
     }
     else
     {
         odd_counter++
     }
 }
    println("Even numbers are $even_counter, and odd numbers are $odd_counter")

}