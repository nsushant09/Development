package DSA.all;

public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[]{1,6,2,5,1}));
    }

    public static boolean increasingTriplet(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {

            int j = i + 1;
            int k = j + 1;

            while (k <= nums.length - 1 && j < nums.length - 1) {
                if (nums[i] < nums[j] && nums[j] < nums[k]) return true;

                if (k < nums.length - 1) {
                    k++;
                } else {
                    j++;
                    k = j + 1;
                }
            }

        }

        return false;
    }

}
