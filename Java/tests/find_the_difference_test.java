package tests;

import solutions.find_the_difference.*;	

public class Find_The_Difference_Test {
    public static void main (String[] args){
        Solution2 solution = new Solution2();
        char result = solution.findTheDifference("abc", "abcd");
        System.out.println(result);
    }
}
