package monotonic_array;

public class Solution1 {
    public boolean isMonotonic(int[] nums){
        if (nums.length <= 1) return true;
        boolean control = false;
        
        for(int i = 0; i+1 < nums.length ; i++){
            control = false;
            if ((nums[i+1] >= nums[i])){
                control = true;
            }
            if (!control) break;
        }
        if (control) return control;

        for(int i = 0; i+1 < nums.length ; i++){
            control = false;
            if ((nums[i+1] <= nums[i])){
                control = true;
            }
            if (!control) break;
        }

        return control;
    }
}

// zaman karmaşıklığı O(n)
// alan karmaşıklığı O(1)