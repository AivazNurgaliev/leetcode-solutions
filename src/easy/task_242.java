package easy;

import java.util.HashMap;
import java.util.Map;

public class task_242 {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> allowedCharacters = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (allowedCharacters.containsKey(s.charAt(i))) {
                allowedCharacters.put(s.charAt(i), allowedCharacters.get(s.charAt(i)) + 1);
            } else {
                allowedCharacters.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (!allowedCharacters.containsKey(t.charAt(i))) {
                return false;
            }
            allowedCharacters.put(t.charAt(i), allowedCharacters.get(t.charAt(i)) - 1);

            if (allowedCharacters.get(t.charAt(i)) < 0) {
                return false;
            }
        }

        return true;
    }
}
