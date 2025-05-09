package solutions.roman_to_integer;

class Solution2 {
    public int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int currentValue = 0;
    
            switch (c) {
                case 'I':
                    currentValue = 1;
                    break;
                case 'V':
                    currentValue = 5;
                    break;
                case 'X':
                    currentValue = 10;
                    break;
                case 'L':
                    currentValue = 50;
                    break;
                case 'C':
                    currentValue = 100;
                    break;
                case 'D':
                    currentValue = 500;
                    break;
                case 'M':
                    currentValue = 1000;
                    break;
                default:
                    System.out.println("Invalid Roman character: " + c);
                    break;
            }
    
            // subtraction rule: if a smaller value comes before a bigger one
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
    
            prevValue = currentValue;
        }
    
        return result;
    }
    

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.romanToInt("III"));
    }
}

/*
public int romanToInt(String s) {
    int result = 0;
    int prevValue = 0;

    for (int i = s.length() - 1; i >= 0; i--) {
        char c = s.charAt(i);
        int currentValue = 0;

        switch (c) {
            case 'I':
                currentValue = 1;
                break;
            case 'V':
                currentValue = 5;
                break;
            case 'X':
                currentValue = 10;
                break;
            case 'L':
                currentValue = 50;
                break;
            case 'C':
                currentValue = 100;
                break;
            case 'D':
                currentValue = 500;
                break;
            case 'M':
                currentValue = 1000;
                break;
            default:
                System.out.println("Invalid Roman character: " + c);
                break;
        }

        // subtraction rule: if a smaller value comes before a bigger one
        if (currentValue < prevValue) {
            result -= currentValue;
        } else {
            result += currentValue;
        }

        prevValue = currentValue;
    }

    return result;
}

 */

/*
| Yöntem                | Hız (Time)      | Alan (Space)        | Açıklama                                     |
| -------------------   | --------------- | ---------------     | -------------------------------------------- |
| Sağdan sola if-else   | O(n)            | O(1)                | Basit ve yaygın yöntem                       |
| Soldan sağa switch    | O(n)            | O(1)                | Aynı performans, daha az sezgisel            |
| 🏁 Performans farkı   | ❌ Anlamlı değil | ❌ Anlamlı değil | Seçim tamamen **kod okunabilirliğine** bağlı |

 */