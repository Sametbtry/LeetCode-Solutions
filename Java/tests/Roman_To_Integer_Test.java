package tests;

import solutions.roman_to_integer.Solution4;

class Roman_To_Integer_Test {
    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        System.out.println(solution.romanToInt("III")); // Output: 3
        System.out.println(solution.romanToInt("IV"));  // Output: 4
        System.out.println(solution.romanToInt("IX"));  // Output: 9
        System.out.println(solution.romanToInt("LVIII")); // Output: 58
        System.out.println(solution.romanToInt("MCMXCIV")); // Output: 1994
    }    
}
