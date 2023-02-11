package medium;

public class task_167 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        twoSum(nums, target);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] indices = new int[2];

        int start = 0;
        int end = numbers.length - 1;

        while(start < end) {
            int sum = numbers[start] + numbers[end];
            if (sum == target) {
               indices[0] = start + 1;
               indices[1] = end + 1;
               break;
            } else if (sum > target) {
                end--;
            } else if (sum < target) {
                start++;
            }
        }

        return indices;
    }

    //Straightforward, but TLE at 19 test
    /*public static int[] twoSum(int[] numbers, int target) {
        int[] indices = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    indices[0] = Math.min(i, j) + 1;
                    indices[1] = Math.max(i, j) + 1;
                    break;
                }
            }
        }

        return indices;
    }*/
}
