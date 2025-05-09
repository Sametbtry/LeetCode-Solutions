package solutions.merge_strings_alternately;

public class Solution3 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int maxLength = Math.max(word1.length(), word2.length());

        for (int i = 0; i < maxLength; i++) 
        {
            if (i < word1.length())    merged.append(word1.charAt(i));
            if (i < word2.length())    merged.append(word2.charAt(i));
        }    
        return merged.toString();        
    }
}

/*
Zaman Karmaşıklığı: O(n), tek dongude tarama yapiliyor.

Uzay Karmaşıklığı: O(n).
 */

