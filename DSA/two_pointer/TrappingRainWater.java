package DSA.two_pointer;

public class TrappingRainWater {
    public static void main(String[] args) {
        System.out.println(trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    public static int trap(int[] height) {
        int total = 0;

        int left = 0;
        int right = left + 1;

        while (height[right] < height[left]) {
            total += (height[left] - height[right]);
            right++;
        }
        left = right;

        return total;
    }
}
