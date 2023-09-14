package DSA.arrays_and_hashing;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{1, 2, 1})));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] output = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            output[i] = nums[i];
            output[nums.length + i] = nums[i];
        }
        return output;
    }
}
