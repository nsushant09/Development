package DSA.arrays_and_hashing;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{0, 0, 0, 0, 0, 1, 0, 0}, 0));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int potsLeft = n;

        for (int i = 0; i < flowerbed.length; i++) {
            if (potsLeft == 0) {
                return true;
            }
            if (
                    flowerbed[i] == 0
                            && (i == 0 || flowerbed[i - 1] == 0)
                            && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)
            ) {
                flowerbed[i] = 1;
                potsLeft--;
            }
        }

        return potsLeft == 0;
    }
}
