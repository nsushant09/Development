package DSA.arrays_and_hashing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GreatestNumberOfCandies {
    public static void main(String[] args) {

    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int max = getMaximum(candies);
        for (int num : candies) {
            list.add(num + extraCandies >= max);
        }
        return list;
    }

    public int getMaximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}
