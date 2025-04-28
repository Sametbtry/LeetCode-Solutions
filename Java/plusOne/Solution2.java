package plusOne;

public class Solution2 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // dizin elemanini bu sekilde arttirabiliyormusuz.
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args){

    }
}
/*
Zaman karmaşıklığı: O(N) (en kötü durumda tüm diziyi tarar).

Uzay karmaşıklığı: Çoğu durumda O(1) (yeni dizi gerekmez).
*/
/*
Sağdan başlar, 9 olmayan ilk rakama 1 ekler ve fonksiyon return eder.

Eğer rakam 9 ise, 0 yapar ve sola geçer.

Eğer hepsi 9 ise, örneğin [9, 9, 9], sonuç  [0, 0, 0] olur ve yeni dizi olusturup return eder.
 */