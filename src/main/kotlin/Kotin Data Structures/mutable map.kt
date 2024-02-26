
/*
*
*
*
*
* */


fun main()
{
    // Mutable map:

    var mutMap = mutableMapOf<Int, String>(1 to "Lilli", 2 to "Payla", 6 to "Kitty")

    // add elements to maps

    mutMap.put(4,"Jack")

    mutMap.remove(6)

    // now print:

    for (item in mutMap.values) // we're printing values
    {
        println(item)
    }

}
