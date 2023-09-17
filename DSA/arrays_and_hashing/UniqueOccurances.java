package DSA.arrays_and_hashing;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurances {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num : arr) {
            if (count.containsKey(num)) {
                count.put(num, count.get(num) + 1);
            } else {
                count.put(num, 1);
            }
        }
        HashSet<Integer> helperSet = new HashSet<>();
        for (int num : count.values()) {
            if (!helperSet.add(num)) {
                return false;
            }
        }
        return true;
    }
}
