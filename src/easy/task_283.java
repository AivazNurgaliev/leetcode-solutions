package easy;

public class task_283 {
    public static void main(String[] args) {
        int[] nums = {0,0,0,1};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        int zeroesLength = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroesLength++;
            } else if (zeroesLength > 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[i - zeroesLength] = temp;
            }
        }
    }
    //Not in place solution
    /*public static void moveZeroes(int[] nums) {
        int[] notInPlace = new int[nums.length];
        int countZeroes = 0;
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                notInPlace[idx] = nums[i];
                idx++;
            } else {
                countZeroes++;
            }
        }

        for (int i = idx; i < notInPlace.length; i++) {
            notInPlace[i] = 0;
        }

        for (int i = 0; i < notInPlace.length; i++) {
            nums[i] = notInPlace[i];
        }
    }*/
}
