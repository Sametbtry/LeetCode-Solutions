package solutions.monotonic_array;

public class Solution2 {
    boolean increasing(int[] nums){
        if (nums.length < 2) return true;
        for (int i = 0 ; i+1 < nums.length ; i++){
            if (nums[i+1] < nums[i]) return false;
        }
        return true;
    }
    boolean descreasing(int[] nums){
        if (nums.length < 2) return true;
        for (int i = 0 ; i+1 < nums.length ; i++){
            if (nums[i+1] > nums[i]) return false;
        }
        return true;
    }

    boolean isMonotonic (int[] nums){
        return descreasing(nums) || increasing(nums);
    } 
}
// zaman karmaşıklığı O(n)
// alan karmaşıklığı O(1)