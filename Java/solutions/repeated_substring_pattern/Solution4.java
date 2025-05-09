package solutions.repeated_substring_pattern;

public class Solution4 {
    public boolean repeatedSubstringPattern(String s) {
        int size = s.length();

        for (int i = 1; i <= size / 2; i++) {
            if (size % i == 0) {
                StringBuilder pattern = new StringBuilder(s.substring(0, i));
                StringBuilder test = new StringBuilder();
                
                // Build the full string using repeated pattern
                for (int j = 0; j < size / i; j++) {
                    test.append(pattern);
                }

                // Compare the constructed string with original string
                if (test.toString().equals(s)) {
                    return true;
                }
            }
        }

        return false;
    }
}

/*
GPT ye kodumu daha verimli hale getir dedim vol2.
 Java 8+ özellikleri ile ve StringBuilder kullanarak kodu biraz daha kısaltabiliriz

StringBuilder kullanımı
→ StringBuilder, string birleştirme işlemlerinde daha verimlidir çünkü string'ler değiştirilemez (immutable) olduklarından, her seferinde yeni bir string oluşturulması gerekir. Bu da performans açısından pahalı olabilir. StringBuilder ile birleştirme işlemleri daha hızlıdır.

String karşılaştırmalarını toString() ile yapma
→ StringBuilder ile yapılan karşılaştırmaları doğrudan toString() metodu ile karşılaştırdım. Bu, bellek kullanımını daha verimli hâle getiriyor çünkü her karşılaştırmada doğrudan oluşturulmuş olan string'ler karşılaştırılıyor.

Daha az değişken kullanımı
→ StringBuilder ile tam olarak neyin karşılaştırıldığını görmek için, yalnızca iki nesne (pattern ve test) kullanılıyor. Gereksiz liste ve ekstra string işlemlerinden kaçınılmış oldu.
 */
