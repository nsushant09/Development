package DSA.slidingwindow

import kotlin.math.min

fun main(){
    println(minSubArrayLen(7, intArrayOf(2,3,1,2,4,3)))
}

fun minSubArrayLen(target: Int, nums: IntArray): Int {
    if(nums.isEmpty())
        return 0

    var minLength = Int.MAX_VALUE

    var left = 0
    var currentSum = 0

    for(right in nums.indices){
        currentSum += nums[right]

        if(currentSum >= target){
            minLength = min(minLength, right - left + 1)
            currentSum -= nums[left]
            left++
        }
    }


    return if (minLength == Int.MAX_VALUE) 0 else minLength
}