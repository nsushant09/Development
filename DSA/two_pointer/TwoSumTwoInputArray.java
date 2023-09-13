package DSA.two_pointer;

import java.util.Arrays;

public class TwoSumTwoInputArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{-1, 0}, -1)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int number = nums[left] + nums[right];
            if (number == target) {
                return new int[]{left + 1, right + 1};
            }
            if (number < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}
