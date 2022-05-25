package easy;
/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 */

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            Character currentChar = s.charAt(i);
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                brackets.push(currentChar);
            } else {
                if (brackets.size() == 0) return false;
                if (i == 0) return false;
                if (brackets.isEmpty()) continue;
                if (matches(brackets.peek(), currentChar)) {
                    brackets.pop();
                } else {
                    return false;
                }

            }
        }

        return brackets.isEmpty();
    }

    private static boolean matches(Character c1, Character c2) {
        return (c1 == '(' && c2 == ')' || c1 == '{' && c2 == '}' || c1 == '[' && c2 == ']');

    }
}
