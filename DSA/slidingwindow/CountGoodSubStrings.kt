package DSA.slidingwindow

fun main() {
    println(countGoodSubstrings("aababcabc"))
}

fun countGoodSubstrings(s: String): Int {
    var count = 0;
    for (i in 0 .. s.length - 3) {
        val substring = s.substring(i, i + 3)
        if (!containsDuplicate(substring)) {
            count++;
        }
    }
    return count;
}

fun containsDuplicate(s: String): Boolean {
    val hashSet = hashSetOf<Char>()
    for (i in s.indices) {
        if (!hashSet.add(s[i]))
            return true;
    }
    return false;
}