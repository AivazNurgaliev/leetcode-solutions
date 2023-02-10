package easy;

public class task_557 {
    public static void main(String[] args) {
        String res = reverseWords("Let's take LeetCode contest");
        System.out.println(res);
    }

    public static String reverseWords(String s) {
        String[] strArr = s.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = reverseString(strArr[i]);

            sb.append(strArr[i]);
            if (i != strArr.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static String reverseString(String s) {
        char[] b = s.toCharArray();
        for (char c : b) {
            System.out.print(c);
        }
        int start = 0;
        int end = b.length - 1;

        while (start < end) {
            char tmp = b[start];
            b[start] = b[end];
            b[end] = tmp;
            start++;
            end--;
        }

        return new String(b);
    }
}