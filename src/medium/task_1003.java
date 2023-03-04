package medium;

import java.util.Stack;

public class task_1003 {

    public static void main(String[] args) {
        String s = "abcabcababcc";
        System.out.println(isValid3(s));
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


    public static boolean isValid3(String s) {
        if (s.length() < 3) {
            return false;
        }

        char[] chars = s.toCharArray();

        int i = 0;
        for (int j = 0; j < chars.length; j++) {
            chars[i++] = chars[j];
            if (i >= 3 && chars[i - 3] == 'a' && chars[i - 2] == 'b' && chars[i - 1] == 'c') {
                i -= 3;
            }
        }

        return i == 0;
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