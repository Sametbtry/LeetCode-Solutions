package solutions.length_of_Last_word;

public class Solution1 {
    public int lengthOfLastWord(String s) {
        String [] words = s.split(" "); // O(n) time ve space 
        String lastWord = words[words.length-1]; 
        return lastWord.length();
    }
}

// time : O(n)
// space : O(n)