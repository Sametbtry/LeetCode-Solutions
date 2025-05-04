import repeated_substring_pattern.*;

public class repeated_substring_pattern_test {
    public static void main(String[] args) {
        // Test cases for the repeatedSubstringPattern method
        String testString1 = "abab";
        String testString2 = "aba";
        String testString3 = "abcabcabcabc";
        String testString4 = "aaba";
        String testString5 = "aabcdaa";

        // Create an instance of the Solution class
        Solution1 solution = new Solution1();

        // Test the method and print results
        System.out.println("Test case 1: " + solution.repeatedSubstringPattern(testString1)); // Expected: true
        System.out.println("Test case 2: " + solution.repeatedSubstringPattern(testString2)); // Expected: false
        System.out.println("Test case 3: " + solution.repeatedSubstringPattern(testString3)); // Expected: true
        System.out.println("Test case 4: " + solution.repeatedSubstringPattern(testString4)); // Expected: false
        System.out.println("Test case 5: " + solution.repeatedSubstringPattern(testString5)); // Expected: false
    }
}