/*
*   A map is an object that maps keys to values
*   map keys are uniques and hold only one value for each key
*   it is a set of key-value pairs. each key refer to exactly one value
*
*
*   the values can be duplicates but keys should be unique
*   maps are used to store logical connections between two objects
*   for example,
*   a student ID and thier name.
*
*   as it is immutable its size is fixed and its methods supports
*  read-only acccess.
*
*
*
*
* */

fun main()
{
  var immMap = mapOf(1 to "Jack", 2 to "John", 9 to "Jack")

  for (key in immMap.keys)
  {
    println(immMap[key])
  }

}