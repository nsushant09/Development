package DSA.slidingwindow

fun main(){
    println(findMaxAverage(intArrayOf(0,4,0,3,2), 1))
}

fun findMaxAverage(nums: IntArray, k: Int): Double {

    var maximum = nums.take(k).sum()
    var comparator = maximum
    for(i in 0 until nums.size - k){
        comparator = comparator - nums[i] + nums[i + k]
        if(comparator > maximum){
            maximum = comparator
        }
    }

    return maximum / k.toDouble()
}