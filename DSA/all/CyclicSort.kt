package DSA.all

import java.util.Arrays

fun main() {
    val array = arrayOf(98, 93, 97, 96, 94, 95, 98)
    println(Arrays.toString(cyclicSort(array)))
}

fun cyclicSort(array: Array<Int>): Array<Int> {

    val min = getMinimum(array)

    for (i in array.indices) {

        while (i != array[i] - min) {
            val correctIndex = array[i] - min
            val temp = array[i]
            array[i] = array[correctIndex]
            array[correctIndex] = temp
        }

    }

    return array;
}

fun getMinimum(array: Array<Int>): Int {
    if (array.isEmpty()) {
        return Int.MIN_VALUE
    }
    var min = array[0]
    for (i in array.indices) {
        if (array[i] < min) {
            min = array[i]
        }
    }
    return min
}