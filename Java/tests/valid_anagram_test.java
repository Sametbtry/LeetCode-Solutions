package tests;

import solutions.valid_anagram.*;

class Valid_anagram_test {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.isAnagram("anagram", "nagaram")); // Output: true
        System.out.println(solution.isAnagram("rat", "car")); // Output: false
        System.out.println(solution.isAnagram("aacc", "ccac")); // Output: false
        System.out.println(solution.isAnagram("abc", "cba")); // Output: true
    }
}