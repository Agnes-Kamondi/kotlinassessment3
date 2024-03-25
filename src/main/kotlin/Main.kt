fun main() {
    remove("Barnie bakes brown bagels and buns")
    number(arrayOf(24,25,26))

    volume(7)
    isPalindrome("Extravaganza")



}
//Write and invoke a function that given the string "Barnie bakes brown bagels and buns" prints out a list of all the
//and characters making up the string excluding all the possible occurrences of b.

fun remove( sentence: String): Array<List<String>> {
    var arr1 = arrayOf(sentence.split("b"))
    println(arr1.contentToString())
        return arr1
    }

//Write and invoke one function that takes an array of integers and returns these 3 values , sum, count and average of
//all the elements.
fun number(num1:Array<Int>):Int{
    var add =num1.sum()
    var length = num1.count()
    var ave = num1.average()
    var real = ave.toInt()
    println(add)
    println(length)
    println(real)
    return add





}
//Volume of a sphere
fun volume(radius:Int):Double{
    var volumeOfSphere = 4/3* 3.14159 * radius *radius *radius
    println(volumeOfSphere)
    return volumeOfSphere

}
fun isPalindrome (word: String){
    var replace = word.reversed()
    if (word == replace){
        println("true")
    }
    else {
        println("false")
    }
}
