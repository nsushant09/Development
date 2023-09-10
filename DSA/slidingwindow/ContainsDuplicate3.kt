package DSA.slidingwindow

import kotlin.math.abs

fun main(){
    println(containsNearbyAlmostDuplicate(intArrayOf(1,2,3,1), 3, 0))
}
fun containsNearbyAlmostDuplicate(nums: IntArray, indexDiff: Int, valueDiff: Int): Boolean {
    if (nums.isEmpty() || indexDiff <= 0 || valueDiff < 0) {
        return false
    }

    val window = mutableSetOf<Int>()

    for (i in nums.indices) {
        if (i > indexDiff) {
            window.remove(nums[i - indexDiff - 1])
        }

        val num = nums[i]

        for (j in num - valueDiff..num + valueDiff) {
            if (window.contains(j)) {
                return true
            }
        }

        window.add(num)
    }

    return false
}