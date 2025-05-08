package length_of_Last_word;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

class Solution2 {
    public int lengthOfLastWord(String s) {
        s = s.trim(); // O(n) time ve space
        
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            }
            else if (length > 0) {
                break;
            }
        }
        
        return length;
    }
}

// for (char index : s) { // hatali kulaim cunku  String bir Iterable<char>  değildir.
// 
// itarable 
// List
// List<String> names = new ArrayList<>();
// for (String name : names) {
//     System.out.println(name);
// }
// 
// Set
// Set<Integer> numbers = new HashSet<>();
// for (int number : numbers) {
//     System.out.println(number);
// }
// 
// Queue
// Queue<String> queue = new LinkedList<>();
// for (String item : queue) {
//     System.out.println(item);
// }
// 
// Array
// int[] arr = {1, 2, 3};
// for (int x : arr) {
//     System.out.println(x);
// }
// 
// custom Iterable Sınıf
// class MyIterable implements Iterable<Integer> {
//     public Iterator<Integer> iterator() {
//         return Arrays.asList(1, 2, 3).iterator();
//     }
// }

// Boşluk Karmaşıklığı (Space Complexity): O(1)
// 
// Bu analiziniz tam olarak doğru değil, daha doğrusu eksik bir değerlendirme içeriyor.
// 
// s = s.trim();: Java'da String nesneleri değiştirilemez (immutable). Bu nedenle, s.trim() metodu, eğer string'in başında veya sonunda kırpılacak boşluklar varsa, genellikle yeni bir String nesnesi oluşturur. Bu yeni oluşturulan string, orijinal string (N) kadar bir uzunluğa sahip olabilir. Dolayısıyla, bu adım O(N) ek alan kullanabilir. Eğer orijinal string'de hiç baş/son boşluk yoksa, trim() metodu mevcut string nesnesini geri döndürebilir, bu durumda bu özel adım için ek alan O(1) olur. Ancak, genel ve en kötü durum senaryosu O(N)'dir.