package moveZeroes;

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

     public static void main (String[] args){
        Solution2 solution = new Solution2();
        int[] nums = new int[] {1, 0, 7, 0, 2};
        solution.moveZeroes(nums);

        for(int num : nums)    System.out.println(num);
    }
}
