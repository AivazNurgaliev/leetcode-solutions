package easy;

public class task_121 {

    public static void main(String[] args) {
        int[] test = {7,1,5,3,6,4};

        System.out.println(maxProfit(test));
    }

    //Two pointers
    public static int maxProfit(int[] prices) {
        int buyPointer = 0;
        int sellPointer = 1;
        int maxProfitValue = 0;
        while (sellPointer < prices.length) {
            if (prices[buyPointer] >= prices[sellPointer]) {
                buyPointer = sellPointer;
                //maxProfitValue = Math.max(maxProfitValue, prices[buyPointer] - prices[sellPointer]);
            } else {
                maxProfitValue = Math.max(maxProfitValue, prices[sellPointer] - prices[buyPointer]);
            }

            sellPointer++;
        }


        return maxProfitValue;
    }
    public static int maxProfit2(int[] prices) {
        int minOverall = Integer.MAX_VALUE;
        int profitIfSoldNow = 0;
        int resProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minOverall) {
                minOverall = prices[i];
            }

            profitIfSoldNow = prices[i] - minOverall;

            if (profitIfSoldNow > resProfit) {
                resProfit = profitIfSoldNow;
            }
        }

        return resProfit;
    }

    //O(n^2)
    //Good but TLE occured at 202 testcase
    public static int maxProfit1(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length ; j++) {
                sum = prices[j] - prices[i];
                if (sum > maxProfit && sum > 0) {
                    maxProfit = sum;
                }
            }

            sum = 0;
        }

        if (maxProfit == Integer.MIN_VALUE) {
            return 0;
        }

        return maxProfit;
    }
}
