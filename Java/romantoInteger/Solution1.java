package romantoInteger;

class Solution1 {
    public int romanToInt(String s) {
        char[] charArray = s.toCharArray(); // O(n) time ve space complexity
        int result = 0;

        for (int i = 0 ; i < charArray.length ; i++) {
            switch (charArray[i]) {
                case 'I':
                    result += 1;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    result += 10;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    result += 100;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
                default:
                    System.out.println("charakter not found in the roman number");
                    break;
            }
            try {
                switch (charArray[i+1]-charArray[i]) {
                    case 'V'-'I':
                        result -= 1*2;
                        break;
                    case 'X'-'V':
                        result -= 5*2;
                        break;
                    case 'L'-'X':
                        result -= 10*2;
                        break;
                    case 'C'-'L':
                        result -= 50*2;
                        break;
                    case 'D'-'C':
                        result -= 100*2;
                        break;
                    case 'M'-'D':
                        result -= 500*2;
                        break;

                    case 'X'-'I':
                        result -= 1*2;
                        break;
                    case 'L'-'V':
                        result -= 5*2;
                        break;
                    case 'C'-'X':
                        result -= 10*2;
                        break;
                    case 'D'-'L':
                        result -= 50*2;
                        break;
                    case 'M'-'C': // V - L de buna esit, hatali sonuclar verebliyor.
                        result -= 100*2;
                        break;
                    default:
                        break;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("dizi sinirlari asildi");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        
        System.out.println(solution.romanToInt("LVIII"));
    }
}

// benim cozumun .yanlis sonuclar verebiliyor. 
// time complexity O(n)
// space complexity O(n)