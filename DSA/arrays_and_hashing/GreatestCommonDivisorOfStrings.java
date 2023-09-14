package DSA.arrays_and_hashing;

public class GreatestCommonDivisorOfStrings {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        int size = Math.min(str1.length(), str2.length());
        StringBuilder common = new StringBuilder();
        int commonSize = 0;

        for (int i = 0; i < size; i++) {
            String temp = common.toString() + str1.charAt(i);

            if (!str1.startsWith(temp) || !str2.startsWith(temp)) {
                break;
            }

            common.append(str1.charAt(i));
            if (str1.length() % temp.length() == 0 && str2.length() % temp.length() == 0) {
                commonSize = temp.length();
            }
        }
        return common.substring(0, commonSize);
    }
}
