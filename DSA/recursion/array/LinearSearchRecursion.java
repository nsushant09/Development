package DSA.recursion.array;

import java.util.ArrayList;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 3, 3, 5, 3, 6, 6};
        System.out.println(search(arr, 0, 3));
        System.out.println(searchArr(arr, 0, 3));
    }

    public static int search(int[] arr, int index, int target) {
        if (arr[index] == target)
            return index;

        if (index == arr.length - 1)
            return -1;

        return search(arr, index + 1, target);
    }

    public static ArrayList<Integer> searchArr(int[] arr, int index, int target) {
        ArrayList<Integer> output = new ArrayList<>();
        if (arr[index] == target) {
            output.add(index);
        }
        if (index == arr.length - 1)
            return output;

        return new ArrayList<>(searchArr(arr, index + 1, target));
    }
}
