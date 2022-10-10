package ElemTesting

import SelectionSort.*
import BinarySearchTree.*
import kotlin.system.measureTimeMillis


fun elemTesting(){
    while(true){
        println("Choose what do you want to do:\n" +
                "\t1. Sort an array\n" +
                "\t2. Binary search\n" +
                "\t3. Test...loading.\n" +
                "\t4. Exit\n")

        var choose = readln().toInt()

        when(choose){
            1 -> ArraySortCheck()
            2 -> BinarySearchCheck()
            3 -> println("in progress....")
            4 -> break
        }
    }
}

fun ArraySortCheck(){
    println("Enter an array(int) in one line:")
    val arr = inputList()
    println("Your array is: ")
    println(arr)

    val time = measureTimeMillis {
        arr.selectionSort()
    }
    println("Your array was succesfully sorted for $time ms, here it is: ")
    println(arr)
}

fun BinarySearchCheck(){
    println("Enter an array(int) with each figure on new line(end it with 0):")
    val arr = inputListWithZero()
    println("Your array is: ")
    println(arr)

    val tree = BinarySearchTree(arr)
    val height = tree.height()
    println("Height of this tree is $height")
}

fun inputList() : MutableList<Int>{
    return readLine()!!.split(" ").map{it.toInt()}.toMutableList()
}

//Ввод заканчивающийся введением нуля.
fun inputListWithZero() : MutableList<Int>{
    val result = mutableListOf<Int>()

    while(true){
        val elem = readln().toInt()
        if (elem == 0) {
            break
        }else{
            result.add(elem)
        }
    }

    return result
}