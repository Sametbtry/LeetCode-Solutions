package solutions.sign_of_the_product_of_an_array;

public class Solution1{
    public int arraySign(int[] nums){

        long result = 1;

        for(int num : nums){
            result *= num;
        }
        if (result > 0) return 1;
        else if (result < 0) return -1;
        else return (int) result;

    }
}

/*
time complexity : O(n)

space complexity : 0(1)

long integer overflow (tamsayı taşması) riski
 */