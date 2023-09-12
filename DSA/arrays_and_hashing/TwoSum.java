package DSA.arrays_and_hashing;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSumTwoPointer(new int[]{1, 2, 3, 4, 5, 6, 7}, 9)));
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                int newIndex = hashMap.get(target - nums[i]);
                if (i != newIndex)
                    return new int[]{i, hashMap.get(target - nums[i])};
            }
        }

        return new int[]{-1, -1};
    }

    public static int[] twoSumTwoPointer(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int number = nums[left] + nums[right];
            if (number == target) {
                return new int[]{left, right};
            }
            if (number < target) {
                left++;
            } else {
                right++;
            }
        }
        return new int[]{-1, -1};
    }

    public boolean threeSum(int[] nums, int target) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int low = i + 1;
            int high = nums.length - 1;

            while (low < high) {
                int current = nums[i] + nums[low] + nums[high];
                if (current == target)
                    return true;
                if (current < target)
                    low++;
                if (current > target)
                    high++;
            }

        }

        return false;
    }
}
