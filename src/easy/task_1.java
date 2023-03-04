package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class task_1 {

    public static void main(String[] args) {
        int[] test = {3, 2, 4};
        int[] res = twoSum2(test, 6);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    //Brute force O(n^2)
    public static int[] twoSum1(int[] nums, int target) {
        int[] res = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }

        return res;
    }

    //Using map
    //O(n)
    public static int[] twoSum2(int[] nums, int target) {
        int[] res = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                return res;
            } else {
                map.put(nums[i], i);
            }
        }


        return res;
    }

   /* //two pointers
    public static int[] twoSum2(int[] nums, int target) {
        int[] res = new int[2];

        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;

        while(start != end) {
            if (nums[start] + nums[end] == target) {
                res[0] = start;
                res[1] = end;
                return res;
            } else if (nums[start] + nums[end] > target) {
                end--;
            } else {
                start++;
            }
        }
        return res;
    }*/
}
