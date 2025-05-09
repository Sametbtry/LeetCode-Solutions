package solutions.move_zeroes;
import java.util.ArrayList; 

public class Solution1 {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> numsCopy = new ArrayList<>();
        int sayi0 = 0;
        for (int num : nums)
        {
            if(num != 0)    numsCopy.add(num);
            else    sayi0 ++;
        }   
        
        for (int i = 0; i < sayi0 ; i++)
        {
            numsCopy.add(0);
        }
        for ( int i = 0 ; i < nums.length ; i++)
        {
            nums[i] = numsCopy.get(i);
        }
    }
}

/*
ikinci bir koleksiyon tipi kulanmamamizi istiyormus soruda

int[] nums = {1,7,0,3,6};
        solution.moveZeroes(nums);
// hata vermezken
        int[] nums = {1,7,0,3,6};
        solution.moveZeroes({1,7,0,3,6});
// neden hata veriyor?

Burada doğrudan dizi literali kullanmaya çalışıyorsunuz, ancak Java'da bu şekilde anonim dizi kullanımı sadece dizi tanımlama sırasında veya belirli bağlamlarda geçerlidir. Metod parametresi olarak doğrudan bu şekilde dizi literali kullanamazsınız.

Eğer metoda doğrudan dizi literali geçmek istiyorsanız, şu şekilde yazmalısınız:
        solution.moveZeroes(new int[]{1,7,0,3,6});
 */
