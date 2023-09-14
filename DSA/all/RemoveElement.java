package DSA.all;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(removeElement(nums, 2));
//        System.out.println(Arrays.toString(removeElement(nums, 2)));
    }

    public static int removeElement(int[] nums, int val) {
        int duplicateCount = 0;
        for (int i = 0; i < nums.length - duplicateCount; i++) {
            while (nums[i] == val && i < nums.length - duplicateCount) {
                nums[i] = nums[nums.length - 1 - duplicateCount];
                nums[nums.length - 1 - duplicateCount] = val;
                duplicateCount++;
            }
        }
//        return nums;
        return nums.length - duplicateCount;
    }
}
