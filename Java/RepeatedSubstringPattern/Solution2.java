package RepeatedSubstringPattern;

class Solution2 {

    public boolean repeatedSubstringPattern(String s) {
        int size = s.length();

        for (int i = 1; i <= size / 2; i++) {
            if (size % i == 0) {
                String pattern = s.substring(0, i);
                
                boolean matches = true;
                for (int j = i; j < size; j += i) {
                    if (!s.substring(j, j + i).equals(pattern)) {
                        matches = false;
                        break;
                    }
                }

                if (matches) return true;
            }
        }

        return false;
    }

    public static void main(String[] args){

        Solution2 solution = new Solution2();
        boolean result = solution.repeatedSubstringPattern("abab");
        System.out.println(result);
    }
}    

/*
GPT ye kodumu daha verimli hale getir dedim.

bolenler ve SubStrings listeleri kaldırıldı
→ Bu listeler belleği gereksiz yere kullanıyor. Onun yerine doğrudan substring ile karşılaştırma yaptım.

Karekök yerine size / 2'ye kadar döngü
→ i bir alt dizenin boyu olduğu için, en fazla size / 2 olabilir. Daha mantıklıdır.

İlk pattern dışındaki substring'leri doğrudan karşılaştırma
→ Yeni stringler oluşturmadan, döngü içinde karşılaştırarak hafıza kullanımı azaltıldı.

Daha anlamlı isimlendirme
→ Kodun okunabilirliğini artırır.
 */

