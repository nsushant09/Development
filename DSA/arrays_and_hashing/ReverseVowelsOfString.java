package DSA.arrays_and_hashing;

import java.util.ArrayList;
import java.util.List;

public class ReverseVowelsOfString {
    public static void main(String[] args) {

    }

    public String reverseVowels(String s) {
        List<Integer> vowelsIndex = new ArrayList<>();
        char[] stringCharArray = s.toCharArray();

        for (int i = 0; i < stringCharArray.length; i++) {
            if (isVowel(stringCharArray[i])) {
                vowelsIndex.add(i);
            }
        }

        for (int i = 0; i < vowelsIndex.size() / 2; i++) {
            char temp = stringCharArray[vowelsIndex.get(i)];
            stringCharArray[vowelsIndex.get(i)] = stringCharArray[vowelsIndex.get(vowelsIndex.size() - 1 - i)];
            stringCharArray[vowelsIndex.get(vowelsIndex.size() - 1 - i)] = temp;
        }

        return new String(stringCharArray);
    }

    public boolean isVowel(Character c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
