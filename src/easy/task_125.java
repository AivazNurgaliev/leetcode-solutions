package easy;

public class task_125 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    //Two pointers
    public static boolean isPalindrome(String s) {
       if (s.isEmpty()) {
           return true;
       }

       int start = 0;
       int end = s.length() - 1;
       while (start < end) {
           if (!Character.isLetterOrDigit(s.charAt(start))) {
               start++;
           } else if (!Character.isLetterOrDigit(s.charAt(end))) {
               end--;
           } else {
               if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                   return false;
               }

               start++;
               end--;
           }
       }

       return true;
    }


    public static boolean isPalindrome1(String s) {
        String convertedString = convertStringToDesiredFormat(s);
        if (convertedString == "") {
            return true;
        }
        StringBuilder sbEven = new StringBuilder(convertedString.substring(convertedString.length() / 2));
        StringBuilder sbOdd = new StringBuilder(convertedString.substring((convertedString.length() / 2) + 1));

        if (convertedString.length() % 2 == 0
                && !(convertedString
                .substring(0, convertedString.length() / 2)
                .equals(sbEven.reverse().toString()))) {
            return false;
        } else if (convertedString.length() % 2 != 0
                &&!(convertedString
                .substring(0, (convertedString.length() / 2))
                .equals(sbOdd.reverse().toString()))) {
            return false;
        }

        return true;
    }

    public static String convertStringToDesiredFormat(String s) {
        StringBuilder stringBuilder = new StringBuilder(s.toLowerCase());

        for (int i = 0; i < s.length(); i++) {
            if (!((s.charAt(i) >= 48 && s.charAt(i) <= 57)
                    || (s.charAt(i) >= 65 && s.charAt(i) <= 90)
                    || (s.charAt(i) >= 97 && s.charAt(i) <= 122))) {
                stringBuilder = stringBuilder.replace(i, i + 1, " ");
            }

        }

        return stringBuilder.toString().replace(" ", "");

    }
}
