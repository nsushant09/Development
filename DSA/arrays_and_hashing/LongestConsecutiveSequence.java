package DSA.arrays_and_hashing;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        AtomicInteger longest = new AtomicInteger();
        longest.set(0);

        for (int num : nums) {
            set.add(num);
        }

        set.forEach(number -> {
            if (!set.contains(number - 1)) {
                int length = 0;
                while (set.contains(number + length)) {
                    length++;
                }
                longest.set(Math.max(longest.get(), length));
            }
        });

        return longest.get();
    }
}
