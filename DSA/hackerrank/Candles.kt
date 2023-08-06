package DSA.hackerrank

fun main() {
    println(birthdayCakeCandles(arrayOf(4,4,1,4)))
}

fun birthdayCakeCandles(candles: Array<Int>): Int {
    candles.sort()
    val maximum = candles[candles.lastIndex]

    var count = 1;
    for (i in 1 until candles.size) {
        if (candles[candles.lastIndex - i] == maximum) {
            count++
        } else {
            break;
        }
    }

    return count;
}
