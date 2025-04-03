package FindtheIndexoftheFirstOccurrenceinaString;

public class Solution1 {
    public int strStr(String haystack, String needle) {

        if (haystack.length() < needle.length()) return -1;
        else if (haystack.length() == needle.length() && haystack == needle) return 0;

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) 
        // haystack in tumunu taramamiza gerek yok.(Sonda bir needle boyutu kamayacak indexkseleri tarama)  
        {
            boolean durum = true;

            for (int j = 0; j < needle.length(); j++) 
            {
                if (haystack.charAt(i + j) != needle.charAt(j)) 
                {
                    durum = false;
                    break;
                }
            }

            if (durum) return i;
        }

        return -1;
    }
}

/*
Zaman Karmaşıklığı: O(n**2), ic ice 2 for kullanılıyor .

Uzay Karmaşıklığı: O(1), 
Bu kodda kullanılan ek bellek miktarı sabittir ve O(1) olarak değerlendirilir. Çünkü:

Algoritma sadece birkaç sabit boyutlu değişken (durum, i, j) kullanır.
Herhangi bir ek veri yapısı veya dinamik bellek tahsisi yapılmaz.
Bu nedenle, bu algoritmanın uzay karmaşıklığı O(1)'dir.
*/

class Main {
    public static void main(String[] args){
        Solution1 solution = new Solution1();
        int result = solution.strStr("sadad", "ad");

        System.out.println(result);
        
    }
}