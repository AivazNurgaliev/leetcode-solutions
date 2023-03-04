package easy;

import java.util.Stack;

public class task_20 {

    public static void main(String[] args) {
        String s = "{{}}";
        System.out.println(isValid1(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == '(' || curr == '{' || curr == '[') {
                stack.push(curr);
            } else if (!stack.isEmpty()){
                if (curr == ')' && stack.pop() != '(') {
                    return false;
                } else if (curr == '}' && stack.pop() != '{') {
                    return false;
                } else if (curr == ']' && stack.pop() != '[') {
                    return false;
                }
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static boolean isValid1(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
