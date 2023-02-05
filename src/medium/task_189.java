package medium;

import java.util.List;

public class task_189 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};

        rotate(nums, 4);
    }

    public static void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;

        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);

    }
    //My solution but get TLE on 37 test case;
    //public static void rotate(int[] nums, int k) {
        /*
        int[] rotated = nums;
        for (int i = 0; i < k; i++) {
            rotated = rotateByOneElem(rotated);
        }


        for (int i = 0; i < nums.length; i++) {
            nums[i] = rotated[i];
        }

       // System.out.println(nums[0]);
        System.out.print("[");
        for (int i = 0; i < rotated.length; i++) {
            System.out.print(rotated[i]);
            if (i != rotated.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
}*/
/*
    public static int[] rotateByOneElem(int[] source) {
        int[] rotated = new int[source.length];

        rotated[0] = source[source.length - 1];
        for (int i = 1; i < rotated.length; i++) {
            rotated[i] = source[i - 1];
        }

        return rotated;
    }*/
}
