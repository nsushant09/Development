package DSA.hackerrank

import java.util.Arrays

fun main() {
    val newTime = convertTime("07:05:45PM")
    println(newTime)
}

fun convertTime(string: String): String {

    val isAM = string.endsWith("AM", true)
    val time = string.subSequence(0, string.length - 2).split(":").toMutableList()

    if (isAM) {
        if (time[0] == "12") {
            time[0] = "00"
        }
    } else {
        if (time[0] != "12") {
            time[0] = (time[0].toInt() + 12).toString()
        }
    }

    return time.joinToString(":");
}