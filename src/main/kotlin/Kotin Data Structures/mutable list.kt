


fun main()
{

    var mutaList = mutableListOf("Jack", "John", "Mike")


    // Modifying the elements:

    mutaList[2] = "Rohit"

    println(mutaList)

    mutaList.add("Shashank")

    print(mutaList)

    // read all elements of list

    for (item in mutaList)
    {
        println(item)
    }


}