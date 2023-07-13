package test;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {10, 40, 20, 30, 70, 60, 40, 30};
        System.out.println(Arrays.toString(sort(array)));
    }

    static int[] sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;

        }
        return array;
    }
}
