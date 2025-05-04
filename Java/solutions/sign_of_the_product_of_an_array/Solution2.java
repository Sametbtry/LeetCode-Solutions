package sign_of_the_product_of_an_array;

public class Solution2 {
    public int arraySign(int[] nums){
        int negatifCount = 0;
        for(int num : nums){
            if (num == 0) return 0;
            
            if(num < 0) negatifCount ++;
        }
        if (negatifCount % 2 == 0) return 1;
        else return -1;
    }
}

/*
time complexity : O(n)

space complexity : 0(1)
 */