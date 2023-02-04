package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task_977 {
    public static void main(String[] args) {
        int[] test = {-7,-3,2,3,11};
        int[] res = sortedSquares(test);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    public static int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        List<Integer> kostyl = new ArrayList<>();
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            if (Math.abs(nums[start]) > Math.abs(nums[end])) {
                kostyl.add(nums[start] * nums[start]);
                start++;
            } else {
                kostyl.add(nums[end] * nums[end]);
                end--;
            }
        }

        Collections.reverse(kostyl);

        for (int i = 0; i < kostyl.size(); i++) {
            ans[i] = kostyl.get(i);
        }

        return ans;
    }
}
