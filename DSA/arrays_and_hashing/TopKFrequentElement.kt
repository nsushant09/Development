package DSA.arrays_and_hashing

fun main(){
    println(topKFrequent(intArrayOf(4, 1, -1, 2, -1, 2, 3), 2).contentToString())
}
fun topKFrequent(nums: IntArray, k: Int): IntArray {
    var map = hashMapOf<Int, Int>()
    for (num in nums) {
        if (map.containsKey(num)) {
            map.replace(num, map[num]!! + 1)
        } else {
            map[num] = 1
        }
    }

    map = map.entries
        .sortedByDescending { it.value }
        .associate { it.key to it.value } as HashMap<Int, Int>

    val output = IntArray(k)
    for(i in 0 until k){
        output[i] = map.keys.elementAt(i)
    }
    return output
}