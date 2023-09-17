package DSA.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        int[] arr = new int[ar.size()];
        ar.toArray();
        System.out.println(isValid("(])"));
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
        parenthesesMap.put('{', '}');
        parenthesesMap.put('}', '{');
        parenthesesMap.put('[', ']');
        parenthesesMap.put(']', '[');
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
