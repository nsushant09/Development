package DSA.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        System.out.println(minWindow("a", "a"));
    }

    static HashMap<Character, Integer> tMap = new HashMap<>();
    static HashMap<Character, Integer> windowMap = new HashMap<>();

    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        int left = 0;
        int right = 0;
        StringBuilder min = new StringBuilder();
        int minLength = Integer.MAX_VALUE;

        for (char c : t.toCharArray()) {
            if (tMap.containsKey(c)) {
                tMap.replace(c, tMap.get(c) + 1);
            } else {
                tMap.put(c, 1);
            }
        }

        addToWindowMap(s.charAt(0));

        while (left <= right) {

            if (windowContainsTarget()) {
                if (right - left + 1 < minLength) {
                    min.replace(0, min.length(), s.substring(left, right + 1));
                    minLength = right - left + 1;
                }
                removeFromWindowMap(s.charAt(left));
                left++;
                continue;
            }

            right++;
            if (right + 1 > s.length()) {
                break;
            }
            addToWindowMap(s.charAt(right));
        }

        return min.toString();
    }

    public static void addToWindowMap(Character c) {
        if (windowMap.containsKey(c)) {
            windowMap.replace(c, windowMap.get(c) + 1);
        } else {
            windowMap.put(c, 1);
        }
    }

    public static void removeFromWindowMap(Character c) {
        if (!windowMap.containsKey(c)) return;
        int count = windowMap.get(c) - 1;
        if (count > 0) {
            windowMap.replace(c, count);
        } else {
            windowMap.remove(c);
        }
    }

    public static boolean windowContainsTarget() {
        Set<Character> set = tMap.keySet();
        for (char c : set) {
            if (!windowMap.containsKey(c)) return false;
            if (windowMap.get(c) < tMap.get(c)) return false;
        }
        return true;
    }
}
