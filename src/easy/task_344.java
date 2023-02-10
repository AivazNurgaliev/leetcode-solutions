package easy;

public class task_344 {

    public static void main(String[] args) {
        char[] s = {'H','a','n','n','a', 'h'};
        reverseString(s);
    }
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char tmp = s[start];
            s[start] = s[end];
            s[end] = tmp;
            start++;
            end--;
        }
    }
}
