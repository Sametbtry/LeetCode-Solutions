package tests;

import solutions.can_make_arithmetic_progression_from_sequence.*;

public class Can_Make_Arithmetic_Progression_From_Sequence_Test {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] arr = {3, 5, 1};
        boolean result = solution.canMakeArithmeticProgressionFromSequence(arr);
        System.out.println(result); // Expected output: true
    }
}
