package ElemTesting

import SelectionSort.*
import kotlin.system.measureTimeMillis


fun elemTesting(){
    println("Enter a array in one line:")
    val arr = inputList()
    println("Your array is: ")
    println(arr)

    val time = measureTimeMillis {
        arr.selectionSort()
    }
    println("Your array was succesfully sorted for $time ms, here it is: ")
    println(arr)
}

fun inputList() : MutableList<Int>{
    val mlist = readLine()!!.split(" ").map{it.toInt()}
    val result = mlist.toMutableList()

    return result
}