package DSA.all;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertionSort(new int [] {6,4,2,3,5})));
    }

    public static int[] insertionSort(int[] array){

        for(int i = 0; i < array.length - 1; i++){

            for(int j = i + 1; j > 0; j--){

                if(array[j] < array[j - 1]){
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }else{
                    break;
                }

            }

        }

        return array;
    }

//    Time complexity : n2

    // 6, 4,2,3,5

    // 6, 4
    // swap 4 with 6
    // 4, 6

    // 4, 6, 2, 3, 5
    // 4,6,2
    //swap 2 with 6
    // 4,2,6
    // swap 2 with 4

    // 2,4,6,3,5

    // i = 2 arr i = 6
    // j = i + 1  = 3 arr j 3

    // arr[j] < arr[j - 1]
    // if true swap 3 with 6


    // 2,4,6,3
    //swap 3 with 6

    // 2,4,3,6
    // arr[j] < arr[j - 1]
    // if true swap 4 with 3

    //swap 3 with 4
    //compare 2 and 3

    // 2,3,4,6,5

    // swap 5 with 6
    // the result is 2,3,4,5,6
}
