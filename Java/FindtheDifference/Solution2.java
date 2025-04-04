package FindtheDifference;

class Solution2 {
    public char findTheDifference(String s, String t) {        
        int sumS = 0, sumT = 0;
    
        for (char c : s.toCharArray()) {
            sumS += c; // s içindeki karakterlerin ASCII toplamı
        }
    
        for (char c : t.toCharArray()) {
            sumT += c; // t içindeki karakterlerin ASCII toplamı
        }
    
        return (char) (sumT - sumS); // Fazladan eklenen harfi bul
    }

    public static void main (String[] args){
        Solution2 solution = new Solution2();
        char result = solution.findTheDifference("abc", "abcd");
        System.out.println(result);
    }
}
/*
Zaman Karmaşıklığı: O(n)

Uzay Karmaşıklığı: O(1)
*/
