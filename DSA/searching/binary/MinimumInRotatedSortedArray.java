package DSA.searching.binary;

public class MinimumInRotatedSortedArray {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 1};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] nums) {

        if (nums.length == 1) return nums[0];

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            if (nums[start] <= nums[end]) {
                return nums[start];
            }

            int mid = start + (end - start) / 2;

            if (nums[mid] >= nums[start]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return 0;
    }
}
