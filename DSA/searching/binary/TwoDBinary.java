package DSA.searching.binary;

public class TwoDBinary {
    public static void main(String[] args) {

    }

    // matrix[i] is the array
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] ints : matrix) {
            if (ints[0] <= target && ints[ints.length - 1] >= target) {
                int start = 0;
                int end = ints.length - 1;
                while (start <= end) {
                    int mid = start + (end - start) / 2;
                    if (ints[mid] == target) {
                        return true;
                    } else if (ints[mid] < target) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
        }
        return false;
    }
}
