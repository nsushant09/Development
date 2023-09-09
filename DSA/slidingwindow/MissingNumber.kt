package DSA.slidingwindow

import java.util.Arrays

fun main(){
    println(missingNumber(intArrayOf(3,0,1)))
}
fun missingNumber(nums: IntArray): Int {
    Arrays.sort(nums)
    for(i in nums.indices){
        if(i != nums[i]){
            return i
        }
    }
    return nums[nums.size - 1] + 1;
}