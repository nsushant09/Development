package DSA.two_pointer;

import java.util.Arrays;

public class MaxNumberOfKPairs {
    public static void main(String[] args) {
        System.out.println(maxOperations(new int[] {1, 2, 3, 4}, 5));
    }
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int count = 0;

        while(left < right){
            if(nums[left] + nums[right] == k){
                right--;
                left++;
                count++;
            }else if (nums[left] + nums[right] > k){
                right--;
            }else{
                left++;
            }
        }
        return count;
    }
}
