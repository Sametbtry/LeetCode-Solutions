package tests;

import solutions.merge_strings_alternately.*;

public class Merge_Strings_Alternately_Test {
    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        String result = solution.mergeAlternately("abc", "defg");
        System.out.println(result);
    }
}
