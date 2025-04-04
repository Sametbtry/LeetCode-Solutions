package repeatedSubstringPattern;

class Solution3 {
    public boolean repeatedSubstringPattern(String s){
        String doubleS = s + s;
        return doubleS.substring(1, doubleS.length() - 1).contains(s); 
    }

    public static void main(String[] args){

        Solution3 solution = new Solution3();
        boolean result = solution.repeatedSubstringPattern("aabcdaa");
        System.out.println(result);
    }
}

// "aabcaabc"
// "aabcaabc aabcaabc"
// "abc aabc aabc aab"