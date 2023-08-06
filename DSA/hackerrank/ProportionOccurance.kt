package DSA.hackerrank

import java.lang.String.format

fun main() {
    val arr = arrayOf(-4, 3, -9, 0, 4, 1)
    plusMinus(arr)
}

fun plusMinus(arr: Array<Int>): Unit {
    var postiveCount = 0f;
    var negativeCount = 0f;

    arr.forEach {
        if (it > 0) {
            postiveCount++;
        }
        if (it < 0) {
            negativeCount++
        }
    }

    println("%.6f".format(postiveCount / arr.size))
    println("%.6f".format(negativeCount / arr.size))
    println("%.6f".format((arr.size - (postiveCount + negativeCount)) / arr.size))

}