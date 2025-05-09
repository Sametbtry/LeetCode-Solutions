package solutions.roman_to_integer;

import java.util.Map;

public class Solution3 {
    public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
            'I', 1, 'V', 5, 'X', 10, 'L', 50,
            'C', 100, 'D', 500, 'M', 1000
        );
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = map.get(s.charAt(i));
            if (i + 1 < s.length() && value < map.get(s.charAt(i + 1))) {
                result -= value;
            } else {
                result += value;
            }
        }
        return result;
    }

}

// time complexity O(n)
// space complexity O(1)
// if else yada switch case yapisindan biraz daha yavas

/*| Özellik                    | `Map.of()`  (java 9+)                | `HashMap`            |
| -------------------------- | -------------------------------------- | -------------------- |
| Değiştirilebilir mi?       | ❌ **Hayır** (immutable)                | ✅ **Evet** (mutable) |
| Yeni değer eklenebilir mi? | ❌ `UnsupportedOperationException` atar | ✅ İstediğin kadar    |
 */