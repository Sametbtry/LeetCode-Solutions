package solutions.plus_one;
import java.lang.Math;

public class Solution1 {
    public int[] plusOne(int[] digits) {

        int size = digits.length;
        long result = 0;
        
        for (int basamak = size-1; basamak >= 0 ; basamak--) {
            result += digits[basamak] * (long) Math.pow(10 , (size - (basamak+1)) );
        }
        result += 1;
        int []newDigits;
        
        if (String.valueOf(result).length() != size){
            newDigits = new int[size+1];
        }else{
            newDigits = new int[size];
        }
        size = newDigits.length;
        String sayiStr = String.valueOf(result);
        for (int i = size-1; i >= 0 ; i--){
            int yeniBasamak = Character.getNumericValue(sayiStr.charAt(i));
            newDigits[i] = yeniBasamak;
        }
        return  newDigits;
    }
}

/*
11 - result += digits[basamak] * (long) Math.pow(10 , (size - (basamak+1)) );
satirindaki (long) Math.pow() fonksiyonu max 19  basamak tutabilir.
yani 19 basamakta sonrasi icin hata verir.

time comlexity:
O(NLogN)  //  Math.pow() ifadesi logN

space comlexity:
O(N)

long result → sabit, yani O(1)
newDigits → yeni dizi, en fazla n+1 uzunluğunda → O(n)
sayiStr → string hali, O(n) uzunluğunda olabilir
 */