



fun main()
{

    var mutableSet = mutableSetOf<Int>(8,9,6,6,10)

    for (item in mutableSet)
    {
        println(item)
    }

    // adding elements to set

    mutableSet.add(77)

    // the above will only add element when it is unique

    println(mutableSet)

    mutableSet.remove(9)

    // will remove the 9 from list.
}