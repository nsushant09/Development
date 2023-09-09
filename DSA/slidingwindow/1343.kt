package DSA.slidingwindow

fun main(){
    println(numOfSubarrays(intArrayOf(2,2,2,2,5,5,5,8), 3, 4))
}

fun numOfSubarrays(arr: IntArray, k: Int, threshold: Int): Int {
    if(arr.size < k)
        return 0

    var count = 0
    var currentSum = 0;
    var isInitialSum = true

    for(i in 0 ..  arr.size - k){

        if(isInitialSum){
            for(j in 0 until k){
                currentSum += arr[j];
            }
            isInitialSum = false
        }

        if((currentSum / k) >= threshold)
            count++

        if(i + k < arr.size) {
            currentSum -= arr[i]
            currentSum += arr[i + k]
        }

    }
    return count
}