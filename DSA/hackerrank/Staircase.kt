package DSA.hackerrank

fun main() {
    val n = 6
    staircase(n)
}

fun staircase(n: Int): Unit {

    for (i in 1..n) {

        for (j in n - i downTo 1) {
            print(" ")
        }

        for (j in 1..i) {
            print("*")
        }

        println()
    }

}