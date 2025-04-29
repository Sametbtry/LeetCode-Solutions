package monotonicArray;

class Solution1 {
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
    
    public static void main(String[] args){
        Solution1 solution = new Solution1();
        boolean result = solution.isMonotonic(new int[] {4,4,3,2});
        System.out.println(result); 
    }
}

// zaman karmaşıklığı O(n)
// alan karmaşıklığı O(1)