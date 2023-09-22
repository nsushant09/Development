package DSA.slidingwindow;

public class MaxAvgSubArray1 {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[] {1,0,1,4,2}, 4));
    }
    public static double findMaxAverage(int[] nums, int k) {
        int number = 0;
        for(int i = 0; i < k; i++){
            number += nums[i];
        }
        double average = number / (double) k;

        for(int i = 1; i <= nums.length - k; i++){
            number -= nums[i - 1];
            number += nums[i - 1 + k];
            if(number / (double) k > average){
                average = number / (double) k;
            }
        }
        return average;
    }
}
