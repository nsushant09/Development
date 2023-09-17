package DSA.arrays_and_hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DiffOfTwoArray {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> output = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }

        output.add(set1.stream().filter(number -> !set2.contains(number)).collect(Collectors.toList()));
        output.add(set2.stream().filter(number -> !set1.contains(number)).collect(Collectors.toList()));

        return output;
    }
}
