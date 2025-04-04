package validAnagram;

class Solution2 {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];  // İngiliz alfabesindeki 26 harf için bir dizi oluştur

        // String s için harflerin frekansıni tutar
        for (char x : s.toCharArray()) {
            count[x - 'a']++;
/*
=== x - 'a' ile karakterin alfabedeki sırasını buluyoruz.
Örneğin:
'a' - 'a' = 97 - 97 = 0   // 'a' karakteri 0. indekse gider.
'b' - 'a' = 98 - 97 = 1   // 'b' karakteri 1. indekse gider.
'c' - 'a' = 99 - 97 = 2   // 'c' karakteri 2. indekse gider.
...
'z' - 'a' = 122 - 97 = 25  // 'z' karakteri 25. indekse gider.
*/

/*
=== count[x - 'a']++ ile bu karakterin sayısını artırıyoruz.
--Örneğin, "apple" kelimesi için:

'a' geldi → count[0]++ olur. (count[0] = 1)

'p' geldi → count[15]++ olur. (count[15] = 1)

'p' geldi → count[15]++ tekrar çalışır. (count[15] = 2)

'l' geldi → count[11]++ olur. (count[11] = 1)

'e' geldi → count[4]++ olur. (count[4] = 1)

--Sonuç olarak count dizisi şu hale gelir:

count = [1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
Burada count[0] = 1 → 'a' harfi 1 kez var.
count[15] = 2 → 'p' harfi 2 kez var.
*/
        }

        // String t için  harflerin frekansini azaltir.
        for (char x : t.toCharArray()) {    
            count[x - 'a']--;
        }

        // Eğer herhangi bir harfin frekansı 0 değilse, anagram değildir
        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        Solution2 S = new Solution2();
        System.out.println(S.isAnagram("abbb", "babk"));
    }
}
    
/*
Zaman Karmaşıklığı: O(n), çünkü s ve t stringleri sadece bir kere taranıyor.

Uzay Karmaşıklığı: O(1), çünkü sabit boyutlu bir int[26] dizisi kullanılıyor.
*/