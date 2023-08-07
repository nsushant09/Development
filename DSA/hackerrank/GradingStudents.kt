package DSA.hackerrank

import java.util.*

fun main() {
    val array = arrayOf(73, 67, 38, 33, 88, 59, 50)
    gradingStudents(array).print()
}

fun gradingStudents(grades: Array<Int>): Array<Int> {

    for (i in grades.indices) {

        if (grades[i] < 38)
            continue;

        if (grades[i] % 5 >= 3)
            grades[i] += (5 - grades[i] % 5)

    }

    return grades;
}