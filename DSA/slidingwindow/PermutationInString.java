package DSA.slidingwindow;

import java.util.Arrays;
import java.util.HashMap;

public class PermutationInString {
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo"));
    }

    public static boolean checkInclusion(String s1, String s2) {

        HashMap<Character, Integer> s1Map = new HashMap<>();
        HashMap<Character, Integer> substringMap = new HashMap<>();

        if (s1.length() > s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);

            if (s1Map.containsKey(c)) {
                s1Map.replace(c, s1Map.get(c) + 1);
            } else {
                s1Map.put(c, 1);
            }

            char subChar = s2.charAt(i);
            if (substringMap.containsKey(subChar)) {
                substringMap.replace(subChar, substringMap.get(subChar) + 1);
            } else {
                substringMap.put(subChar, 1);
            }
        }

        for (int i = s1.length() - 1; i < s2.length(); i++) {
            if (i != s1.length() - 1) {
                char todelete = s2.charAt(i - s1.length());
                char toadd = s2.charAt(i);

                int todeleteCount = substringMap.get(todelete) - 1;
                if(todeleteCount > 0){
                    substringMap.replace(todelete, todeleteCount);
                }else{
                    substringMap.remove(todelete);
                }


                if (substringMap.containsKey(toadd)) {
                    substringMap.replace(toadd, substringMap.get(toadd) + 1);
                } else {
                    substringMap.put(toadd, 1);
                }

            }
            if (s1Map.equals(substringMap)) {
                return true;
            }
        }
        return false;
    }

    public static String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
