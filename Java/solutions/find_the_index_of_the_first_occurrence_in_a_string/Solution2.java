package find_the_index_of_the_first_occurrence_in_a_string;

public class Solution2 {
    public int strStr(String haystack, String needle) {
        for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
            if(haystack.substring(i,j).equals (needle)){
                return i;
            }
        }
        return -1;
    }
}

/*
Zaman Karmaşıklığı: O(n)

Uzay Karmaşıklığı: O(1)
*/
