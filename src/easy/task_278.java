package easy;

public class task_278 {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        int middle = 0;
        while (left <= right) {
            middle = left + (right - left) / 2;

            /*if (isBadVersion(middle)) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }*/
        }

        return left;
    }
}
