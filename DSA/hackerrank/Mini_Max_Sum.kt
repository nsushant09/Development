package DSA.hackerrank

import kotlin.math.max

fun main() {

}

fun miniMaxSum(arr: Array<Int>): Unit {
    var minimum: Long = Long.MAX_VALUE
    var maximum: Long = Long.MIN_VALUE;

    var totalSum: Long = 0;

    for (i in arr) {
        totalSum += i;
    }

    for (i in arr) {
        val value = totalSum - i

        if (value > maximum) {
            maximum = value
        }

        if (value < minimum) {
            minimum = value
        }

    }

}