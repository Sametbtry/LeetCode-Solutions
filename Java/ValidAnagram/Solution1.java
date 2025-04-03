package ValidAnagram;

import java.util.Arrays;

// Siralayip Karsilastirma

public class Solution1 {
    public boolean isAnagram(String s, String t){
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
 
        Arrays.sort(sChars);
        Arrays.sort(tChars);
/*
return sChars.equals(tChars);
Java'da equals() metodu referansları (bellek adreslerini) karşılaştırır, ancak bizim karşılaştırmak istediğimiz şey dizilerin içeriğidir.

Java'da dizilerin içeriğini karşılaştırmak için Arrays.equals() kullanmalısın:
 */
        return Arrays.equals(sChars, tChars);
    }
}

/*
Zaman Karmaşıklığı: O(n log n), çünkü Arrays.sort() kullanılıyor.

Uzay Karmaşıklığı: O(n), çünkü iki yeni karakter dizisi (char[]) oluşturuluyor.
 */

 class Main1{
    public static void main(String[] args){
        Solution1 S = new Solution1();
        System.out.println(S.isAnagram("abbb", "babk"));
    }
 }