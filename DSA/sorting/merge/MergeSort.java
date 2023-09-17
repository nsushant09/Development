package DSA.sorting.merge;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[]{10, 20, 60, 40, 78, 23, 45, 57};
        mergeSortInPlace(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSortInPlace(int[] array, int start, int end) {
        if (end - start == 1) return;
        int mid = start + (end - start) / 2;

        mergeSortInPlace(array, start, mid);
        mergeSortInPlace(array, mid, end);
        mergeInPlace(array, start, mid, end);
    }

    public static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] merged = new int[end - start];
        int firstPointer = start;
        int secondPointer = mid;
        int mergePointer = 0;

        while (firstPointer < mid && secondPointer < end) {
            if (arr[firstPointer] < arr[secondPointer]) {
                merged[mergePointer] = arr[firstPointer];
                firstPointer++;
            } else {
                merged[mergePointer] = arr[secondPointer];
                secondPointer++;
            }
            mergePointer++;
        }
        while (firstPointer < mid) {
            merged[mergePointer] = arr[firstPointer];
            firstPointer++;
            mergePointer++;
        }
        while (secondPointer < end) {
            merged[mergePointer] = arr[secondPointer];
            secondPointer++;
            mergePointer++;
        }

        for (int i = 0; i < merged.length; i++) {
            arr[start + i] = merged[i];
        }
    }

    public static int[] mergeSort(int[] array) {
        if (array.length == 1) return array;
        int mid = array.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(array, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(array, mid, array.length));

        return merge(left, right);
    }

    public static int[] merge(int[] first, int[] second) {
        int firstPointer = 0;
        int secondPointer = 0;
        int mergePointer = 0;
        int[] merge = new int[first.length + second.length];

        while (firstPointer < first.length && secondPointer < second.length) {
            if (first[firstPointer] < second[secondPointer]) {
                merge[mergePointer] = first[firstPointer];
                firstPointer++;
            } else {
                merge[mergePointer] = second[secondPointer];
                secondPointer++;
            }
            mergePointer++;
        }

        while (firstPointer < first.length) {
            merge[mergePointer] = first[firstPointer];
            firstPointer++;
            mergePointer++;
        }
        while (secondPointer < second.length) {
            merge[mergePointer] = second[secondPointer];
            secondPointer++;
            mergePointer++;
        }

        return merge;
    }
}
