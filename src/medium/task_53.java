package medium;

public class task_53 {

    public static void main(String[] args) {
        int[] tmp = {1};
        System.out.println(maxSubArray(tmp));
    }

    //Ok, but TLE
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= i; j--) {
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }

                if (sum > maxSum) {
                    maxSum = sum;
                    sum = 0;
                } else {
                    sum = 0;
                }
            }
        }

        return maxSum;
    }
}
