package tests;

import solutions.move_zeroes.*;

public class Move_Zeroes_Test {
    public static void main (String[] args){
        Solution1 solution = new Solution1();
        int[] nums = new int[] {1, 0, 7, 0, 2};
        solution.moveZeroes(nums);

        for(int num : nums)    System.out.println(num);
    }
}
