package DSA.arrays_and_hashing;

public class ThreeSumClosest {
    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[] {-1,2,1,-4}, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int minDifference = Integer.MAX_VALUE;
        int minNumber = 0;
        int number = 0;

        for (int i = 0; i < 3; i++) {
            number += nums[i];
        }
        if (Math.abs(target - number) < minDifference) {
            minDifference = Math.abs(target - number);
            minNumber = number;
        }
        for (int i = 0; i < nums.length - 3; i++) {
            number = number - nums[i] + nums[i + 3];
            if (Math.abs(target - number) < minDifference) {
                minDifference = Math.abs(target - number);
                minNumber = number;
            }
        }
        return minNumber;
    }
}
