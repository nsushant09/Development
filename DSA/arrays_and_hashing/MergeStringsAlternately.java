package DSA.arrays_and_hashing;

import java.util.Arrays;

public class MergeStringsAlternately {
    public static void main(String[] args) {

    }

    public String mergeAlternately(String word1, String word2) {
        int firstPointer = 0;
        int secondPointer = 0;
        int mergedPointer = 0;
        char[] merged = new char[word1.length() + word2.length()];

        for (int i = 0; i < Math.min(word1.length(), word2.length()); i++) {
            merged[mergedPointer] = word1.charAt(firstPointer);
            firstPointer++;
            mergedPointer++;
            merged[mergedPointer] = word2.charAt(secondPointer);
            secondPointer++;
            mergedPointer++;
        }

        while (firstPointer < word1.length()) {
            merged[mergedPointer] = word1.charAt(firstPointer);
            firstPointer++;
            mergedPointer++;
        }

        while (secondPointer < word2.length()) {
            merged[mergedPointer] = word2.charAt(secondPointer);
            secondPointer++;
            mergedPointer++;
        }

        return new String(merged);
    }

}
