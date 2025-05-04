package find_the_difference;

public class Solution1 {
    public char findTheDifference(String s, String t) {
        int result = 0;
        for (int i = 0; i < s.length(); i++){
            result -= s.charAt(i);
            result += t.charAt(i);
        }
        return (char)(result + t.charAt(t.length()-1));
    }


    public static void main (String[] args){
        Solution1 solution = new Solution1();
        char result = solution.findTheDifference("abc", "abcd");
        System.out.println(result);
    }
}
/*
Zaman Karmaşıklığı: O(n)

Uzay Karmaşıklığı: O(1)
*/