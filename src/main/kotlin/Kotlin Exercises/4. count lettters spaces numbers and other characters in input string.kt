import java.util.Scanner


fun main()
{
   var s1 = Scanner(System.`in`)


    println("Enter your text")
    var text = s1.nextLine()

    count(text);


}

fun count(text: String)
{
    var ch = text.toCharArray()


    var letter = 0

    var space = 0

    var num = 0

    var others = 0


    for (c in ch.withIndex())
    {

        if(Character.isLetter(c.value))
        {
            letter++

        }
        else if(Character.isDigit(c.value))
        {
            num++
        }
        else if(Character.isSpaceChar(c.value))
        {
            space++
        }
        else
        {
            others ++
        }

    }

    println("Letters:  $letter \n  spaces:  $space  \n  numbers: $num  \n others  $others")
}