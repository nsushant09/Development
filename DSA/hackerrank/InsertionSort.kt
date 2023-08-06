package DSA.hackerrank

import java.util.Arrays

fun main() {
    val arr = arrayOf(5, 4, 3, 2, 1)
    println(Arrays.toString(insertionSort(arr)))
}

fun insertionSort(arr: Array<Int>): Array<Int> {

    for (i in 0 until arr.size - 1) {
        arr.minorSort(i)
    }

    return arr;
}

fun Array<Int>.minorSort(end: Int) {
    for (i in end + 1 downTo 1) {
        if (this[i] < this[i - 1]) {
            val temp = this[i]
            this[i] = this[i - 1]
            this[i - 1] = temp
        }
    }
}