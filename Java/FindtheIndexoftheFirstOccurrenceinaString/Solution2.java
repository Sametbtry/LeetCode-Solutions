package findtheIndexoftheFirstOccurrenceinaString;

class Solution2 {
    public int strStr(String haystack, String needle) {
        for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
            if(haystack.substring(i,j).equals (needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Solution2 solution = new Solution2();
        int result = solution.strStr("sadad", "ad");

        System.out.println(result);
        
    }
}

/*
Zaman Karmaşıklığı: O(n)

Uzay Karmaşıklığı: O(1)
*/
