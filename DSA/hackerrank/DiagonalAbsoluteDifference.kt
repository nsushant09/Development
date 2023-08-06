package DSA.hackerrank

fun diagonalDifference(arr: Array<Array<Int>>): Int {

    var diagonalFirstSum = 0;
    var diagonalSecondSum = 0;

    for(i in 0 until arr.size){
        diagonalFirstSum += arr[i][i];
        diagonalSecondSum += arr[arr.size - 1 - i][i];
    }

    return Math.abs(diagonalFirstSum - diagonalSecondSum);
}

fun main() {

    val array: Array<Array<Int>> = arrayOf(
        arrayOf(11, 2, 4),
        arrayOf(4, 5, 6),
        arrayOf(10, 8, -12)
    )

    println(diagonalDifference(array))

}


