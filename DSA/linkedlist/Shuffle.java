package DSA.linkedlist;

public class Shuffle {
    public static void main(String[] args) {

    }

    public static int[] shuffle(int[] nums, int n) {
        int[] output = new int[nums.length];
        int index = 0;
        for (int i = 0; i < n; i++) {
            output[index] = nums[i];
            output[index + 1] = nums[i + n];
            index += 2;
        }
        return output;
    }
}
