package SelectionSort

fun <T : Comparable<T>> MutableList<T>.selectionSort(){
    for (i in size - 1 downTo 0){
        var m = this[i] //максимальный элемент
        var p = i //индекс максимального элемента

        for (j in 0 until i){
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


fun <T : Comparable<T>> List<T>.selectionSort() : List<T>{
    return this.toMutableList()
        .also{ it.selectionSort() }
        .toList()
}