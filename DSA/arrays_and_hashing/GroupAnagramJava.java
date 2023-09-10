package DSA.arrays_and_hashing;

import java.util.*;

public class GroupAnagramJava {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String string : strs) {
            char[] charArray = string.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);

            if (map.containsKey(sortedString)) {
                map.get(sortedString).add(string);
            } else {
                List<String> list = new ArrayList<>();
                list.add(string);
                map.put(sortedString, list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
