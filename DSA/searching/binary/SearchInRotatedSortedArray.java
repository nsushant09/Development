package DSA.searching.binary;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 5));
    }

    static public int search(int[] nums, int target) {
        int maxIndex = maxIndex(nums);

        int leftSearch = indexWiseSearch(nums, target, 0, maxIndex);
        if (leftSearch != -1) return leftSearch;
        return indexWiseSearch(nums, target, maxIndex + 1, nums.length - 1);
    }

    public static int indexWiseSearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int maxIndex(int[] nums) {
        if (nums.length == 1) return 0;
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[start] >= nums[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }

            if (start == end) {
                return end;
            }
        }

        return -1;
    }
}
