fun main() {
    println("Enter size of array:")

    val size = readLine()!!.toInt()
    //println(size)
    //val arr = readLine()?.let { arrayOf(it.split(" ").toInt()) }
    val arr = Array(size, {0})
    //println(arr)
    var p = size
    var i = 0
    while(p > 0){
        arr[i] = readLine()!!.toInt()
        i++
        p--
    }

    for (a in arr)
        print("$a ")

    println()
    arr.selectionSort()
    for (a in arr)
        print("$a ")

}