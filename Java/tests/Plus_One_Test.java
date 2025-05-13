package tests;

import solutions.plus_one.*;

public class Plus_One_Test {
    public static void main(String[] args){
        Solution1 solution = new Solution1();
        int[] example = solution.plusOne(new int[] {1,2,3,4,5,6,1,2,3,4,5,6,1,2,3,4,5,6,1});
        System.out.println(example);
        for(int num : example){
            System.out.println(num);
        }
    }
}
