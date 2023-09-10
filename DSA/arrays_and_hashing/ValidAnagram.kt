package DSA.arrays_and_hashing

fun main(){
    println(isAnagram("rat", "car"))
}
fun isAnagram(s: String, t: String): Boolean {
    return s.toCharArray().sortedArray().contentEquals(t.toCharArray().sortedArray())
}