package SelectionSort

fun <T : Comparable<T>> MutableList<T>.selectionSort(){
    val maxindex = size - 1
    for (i in maxindex downTo 0){
        var m = this[i] //максимальный элемент
        var p = i //индекс максимального элемента

        for (j in 0 until i - 1){
            if (m < this[j]){
                m = this[j]
                p = j
            }
        }

        if (p != i){
            val t = this[i]
            this[i] = this[p]
            this[p] = t
        }
    }
}

fun selectionSort(arr : Array<Int>, size: Int) : Array<Int>{
    val maxindex = size - 1
    for (i in maxindex downTo 0){
        var m = arr[i] //максимальный элемент
        var p = i //индекс максимального элемента

        for (j in 0 until i - 1){
            if (m < arr[j]){
                m = arr[j]
                p = j
            }
        }

        if (p != i){
            val t = arr[i]
            arr[i] = arr[p]
            arr[p] = t
        }
    }

    return arr
}