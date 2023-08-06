package DSA.hackerrank

import java.util.Arrays
import kotlin.math.max

// Performs well on a small list
fun main() {
    val array = arrayOf(10, 8, 4, 20, 19, 18, 23, 90, 43, 72)
    println(Arrays.toString(selectionSort(array)))
}

fun selectionSort(array: Array<Int>): Array<Int> {

    for (i in array.indices) {
        var maxIndex = 0;

        for (j in 0 until array.size - i) {
            if (array[j] > array[maxIndex]) {
                maxIndex = j
            }
        }

        val temp = array[array.size - 1 - i]
        array[array.size - 1 - i] = array[maxIndex]
        array[maxIndex] = temp
    }

    return array;
}