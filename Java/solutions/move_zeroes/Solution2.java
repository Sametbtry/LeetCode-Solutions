package solutions.move_zeroes;

public class Solution2 {
    public void moveZeroes(int[] nums) 
    {
         int index = 0;
         for (int num : nums)
         {
             if (num != 0)
             {
                 nums[index] = num;
                 index++;
             }
         }
 
         while (index < nums.length)
         {
             nums[index] = 0;
             index++;
         }
     }
}
