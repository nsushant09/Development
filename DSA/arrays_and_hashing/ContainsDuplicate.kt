package DSA.arrays_and_hashing

import java.util.*

fun containsDuplicate(nums: IntArray): Boolean {
    Arrays.sort(nums)
    for(i in nums.indices){
        if (nums[i] == nums[i + 1]) return true
    }
    return false
}