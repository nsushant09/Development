package DSA.stack;

import java.util.HashMap;
import java.util.Stack;

public class LongestValidParentheses {

    public static void main(String[] args) {
        System.out.println(longestValidParentheses("()(())"));
    }
    public static int longestValidParentheses(String s) {
        if (s.length() == 0) return 0;

        int max = 0;
        int left = 0;
        int right = 1;


        while (right < s.length()) {
            String substring = s.substring(left, right + 1);
            if (isValid(substring)) {
                max = Math.max(max, right - left + 1);
                right += 2;
            } else {
                left ++;
                right++;
            }
        }

        return max;
    }

    static HashMap<Character, Character> parenthesesMap = new HashMap<>();

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        setParenthesesMap();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (isOpened(c)) {
                stack.push(c);
            } else {
                if (stack.size() > 0 && matchesParenthesesPrevious(stack.peek(), c)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }

    public static void setParenthesesMap() {
//        parenthesesMap.put('{', '}');
//        parenthesesMap.put('}', '{');
//        parenthesesMap.put('[', ']');
//        parenthesesMap.put(']', '[');
        parenthesesMap.put('(', ')');
        parenthesesMap.put(')', '(');
    }

    public static boolean isOpened(char c) {
        return c == '[' || c == '{' || c == '(';
    }

    public static boolean matchesParenthesesPrevious(char previous, char current) {
        return parenthesesMap.get(current) == previous;
    }
}
