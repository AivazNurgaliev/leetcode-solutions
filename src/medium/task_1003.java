package medium;

import java.util.Stack;

public class task_1003 {

    public static void main(String[] args) {
        String s = "abcabcababcc";
        System.out.println(isValid(s));
    }

    //bad
    public static boolean isValid1(String s) {
        if (s.length() < 3) {
            return false;
        }

        StringBuilder b = new StringBuilder(s);
        while (s.length() != 0) {
            int idxPosition = s.indexOf("abc");
            if (idxPosition == -1) {
                return false;
            }
            b.delete(idxPosition, idxPosition + 3);
            s = b.toString();
        }
        return true;
    }

    public static boolean isValid2(String s) {
        if (s.length() < 3) {
            return false;
        }

        while (s.length() != 0) {
            int idxPosition = s.indexOf("abc");
            if (idxPosition == -1) {
                return false;
            }
            s = s.replace("abc", "");
        }
        return true;
    }


    public static boolean isValid(String s) {
        if (s.length() < 3) {
            return false;
        }

        Stack<Character> charStack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (c == 'c') {
                if (charStack.isEmpty() || charStack.pop() != 'b') {
                    return false;
                }
                if (charStack.isEmpty() || charStack.pop() != 'a') {
                    return false;
                }
            } else {
                charStack.push(c);
            }
        }
        return charStack.isEmpty();
    }
}