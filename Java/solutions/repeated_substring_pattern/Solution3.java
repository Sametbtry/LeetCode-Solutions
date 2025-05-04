package repeated_substring_pattern;

public class Solution3 {
    public boolean repeatedSubstringPattern(String s){
        String doubleS = s + s;
        return doubleS.substring(1, doubleS.length() - 1).contains(s); 
    }
}

// "aabcaabc"
// "aabcaabc aabcaabc"
// "abc aabc aabc aab"