package mergeStringsAlternately;

class Solution1 {
    public String mergeAlternately(String word1, String word2) {
/*
        int word1Len = word1.length();
        int word2Len = word2.length();
        int currIndex = 0;
        
        StringBuilder resultStr = new StringBuilder();

        while (currIndex < word1Len && currIndex < word2Len) {
            resultStr.append(word1.charAt(currIndex)); // (mutablle) yani resultStr dogrudan degisti.
            resultStr.append(word2.charAt(currIndex));
            currIndex++;
        }
        
        if (word1Len < word2Len){
            while (currIndex < word2Len) {
                resultStr.append(word2.charAt(currIndex));
                currIndex++;
            }
        } else {
            while (currIndex < word1Len) {
                resultStr.append(word1.charAt(currIndex));
                currIndex++;
            }
        }   
        return resultStr.toString();
        }
 */
        int currIndex = 0;
        String resultStr = "";

        while (currIndex < word1.length() && currIndex < word2.length())
        {
            resultStr = resultStr.concat(String.valueOf(word1.charAt(currIndex)));
            // (immutable) yani degisikligi kaydetmek icin baska bir degiskene ataman lazim.
            // String.valueOf() genelde primitive degiskenlerde kulanilir.
            resultStr = resultStr.concat(String.valueOf(word2.charAt(currIndex)));
            currIndex ++;
        }
        
        if (word1.length() < word2.length())
        {
            while(currIndex < word2.length())
            {
                resultStr = resultStr.concat(String.valueOf(word2.charAt(currIndex)));
                currIndex ++;
            }
        }
        else 
        {
            while(currIndex < word1.length())
            {
                resultStr = resultStr.concat(String.valueOf(word1.charAt(currIndex)));
                currIndex ++;
            }
        }
        return resultStr;
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        String result = solution.mergeAlternately("abc", "defg");
        System.out.println(result);
    }
}

/*
 Eğer çok fazla karakter işlemi yapıyorsan ve performans önemliyse, StringBuilder (mutablle) kullanmayı da düşünebilirsin.

 Bu, çok fazla concat() işlemi yapmaktan daha verimli olacaktır çünkü String nesneleri immutable (değiştirilemez) olduğu için her concat() çağrısı yeni bir String nesnesi oluşturur.
 */

 /*

Kodun time complexity (zaman karmaşıklığı) ve space complexity (alan karmaşıklığı) aşağıdaki gibi analiz edilebilir:

---

 Time Complexity (Zaman Karmaşıklığı):
- Kodda, `word1` ve `word2` dizelerinin uzunluklarına bağlı olarak her bir karakter üzerinde işlem yapılmaktadır.
- İlk `while` döngüsü, `word1` ve `word2` dizelerinin ortak uzunluğu kadar çalışır (yani `min(word1.length(), word2.length())`).
- Daha sonra, uzun olan dizenin kalan kısmını işlemek için ikinci bir `while` döngüsü çalışır. Bu döngü, uzun olan dizenin kalan karakter sayısı kadar çalışır.
- Toplamda, her iki döngü birlikte `O(n + m)` kadar çalışır, burada:
  - `n = word1.length()`
  - `m = word2.length()`

Sonuç: Zaman karmaşıklığı O(n + m)'dir.

---

 Space Complexity (Alan Karmaşıklığı):
- Kodda, `resultStr` adında bir `String` değişkeni kullanılıyor. Ancak Java'da `String` nesneleri immutable (değiştirilemez) olduğu için, her `concat` çağrısı yeni bir `String` nesnesi oluşturur. Bu nedenle, `resultStr`'in her bir karakter eklenmesiyle birlikte yeni bir kopyası oluşturulur.
- Bu, toplamda `resultStr`'in uzunluğu kadar ek alan gerektirir. Sonuç olarak, `resultStr`'in uzunluğu `n + m` olduğundan, alan karmaşıklığı O(n + m)'dir.

---

 Sonuç:
- Time Complexity: `O(n + m)`
- Space Complexity: `O(n + m)`

Not: Daha verimli bir çözüm için `StringBuilder` kullanabilirsiniz. Bu, `concat` yerine daha az bellek kullanır ve daha hızlıdır. İsterseniz bu optimizasyonu uygulamanız için yardımcı olabilirim.
*/

/*
Not: Daha verimli bir çözüm için StringBuilder kullanabilirsiniz. Bu, concat yerine daha az bellek kullanır ve daha hızlıdır. İsterseniz bu optimizasyonu uygulamanız için yardımcı olabilirim.
bu durumda complexity ler degisir mi?
*/

/*
Evet, `StringBuilder` kullanıldığında space complexity (alan karmaşıklığı) değişir, ancak time complexity (zaman karmaşıklığı) aynı kalır. İşte detaylı açıklama:

---

 Time Complexity (Zaman Karmaşıklığı):
- `StringBuilder` kullanıldığında, her bir karakter ekleme işlemi amortize olarak O(1) zaman alır.
- Kod hala her iki dizeyi (`word1` ve `word2`) tamamen dolaşmak zorundadır. Bu nedenle, toplamda tüm karakterler için işlem yapılır ve zaman karmaşıklığı değişmez.
- Sonuç: Zaman karmaşıklığı hala O(n + m)'dir.

---

 Space Complexity (Alan Karmaşıklığı):
- `String` kullanıldığında, her `concat` çağrısı yeni bir `String` nesnesi oluşturur ve bu, gereksiz bellek tüketimine yol açar. Bu nedenle, `String` ile alan karmaşıklığı O(n + m) idi.
- Ancak, `StringBuilder` kullanıldığında, tek bir dinamik tampon (buffer) kullanılır ve tüm karakterler bu buffer'da biriktirilir. Bu, ek bellek tahsisini önler.
- `StringBuilder`'ın kullandığı alan, yalnızca birleştirilen dizelerin toplam uzunluğuna eşittir.
- Sonuç: Alan karmaşıklığı O(n + m) olarak kalır, ancak daha verimli bir şekilde kullanılır (yani, gereksiz nesne oluşturma maliyeti ortadan kalkar).

---

 Sonuç:
- Time Complexity: Değişmez, hala O(n + m).
Space Complexity: Değişmez, hala O(n + m), ancak bellek kullanımı daha verimli hale gelir.

Eğer isterseniz, `StringBuilder` ile optimize edilmiş bir çözüm yazabilirim. Bu, kodunuzu daha hızlı ve daha temiz hale getirecektir.
 */

