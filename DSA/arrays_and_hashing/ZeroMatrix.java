package DSA.arrays_and_hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ZeroMatrix {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 0, 5, 6},
                {7, 8, 9, 0}
        };

        Set<Integer> rows = new HashSet<>();
        Set<Integer> columns = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    rows.add(i);
                    columns.add(j);
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (rows.contains(i) || columns.contains(j)) {
                    arr[i][j] = 0;
                }
            }
        }

        for(int[] iArr : arr){
            System.out.println(Arrays.toString(iArr));
        }
    }
}
