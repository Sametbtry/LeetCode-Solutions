package tests;

import solutions.sign_of_the_product_of_an_array.*;

public class Sign_of_the_product_of_an_array_test {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.arraySign(new int[]{-1, -2, -3, -4, 3, 2, 1})); // Output: 1
        System.out.println(solution.arraySign(new int[]{1, 5, 0, 2, -3})); // Output: 0
        System.out.println(solution.arraySign(new int[]{-1, 1, -1, 1, -1})); // Output: -1
    }
}
