package DSA.recursion.level1;

import java.util.Arrays;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(search(arr, 9, 0, arr.length - 1));
    }

    public static int search(int[] arr, int target) {
        int mid = arr.length / 2;

        if (target == arr[mid])
            return target;

        if (arr.length == 1) {
            return -1;
        }

        if (target > arr[mid]) {
            return search(Arrays.copyOfRange(arr, mid, arr.length), target);
        } else {
            return search(Arrays.copyOfRange(arr, 0, mid), target);
        }
    }

    public static int search(int[] arr, int target, int start, int end) {
        int mid = start + (end - start) / 2;

        if (start > end) return -1;

        if (target == arr[mid])
            return mid;

        if (target > arr[mid])
            start = mid + 1;
        else
            end = mid;

        return search(arr, target, start, end);
    }
}
