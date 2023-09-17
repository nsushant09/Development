package DSA.arrays_and_hashing;

import java.util.Objects;

public class URLify {
    public static void main(String[] args) {
        System.out.println(convertToUrl("Mr John Smith  "));
    }

    public static String convertToUrl(String s) {
        StringBuilder url = new StringBuilder();
        char prev = '.';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ' && prev != ' ' && i != s.length() - 1) {
                url.append("%20");
            } else {
                if (c != ' ') url.append(c);
            }
            prev = c;
        }
        if (Objects.equals(url.substring(url.length() - 3, url.length()), "%20")) {
            url.delete(url.length() - 3, url.length());
        }
        return url.toString();
    }
}
