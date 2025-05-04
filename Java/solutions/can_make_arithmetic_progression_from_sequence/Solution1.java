package can_make_arithmetic_progression_from_sequence;

import java.util.Arrays;

public class Solution1 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int control = arr[1] - arr[0] ;  // giving us a time complexity of O(n log(n))
        boolean controlFor = true;
        for (int i = 0 ; i+1 < arr.length; i++){
            if (control != arr[i+1] - arr[i]) {
                controlFor = false;
            }
            if(!controlFor) break;
        }
        return controlFor;
    }
}
// sapace complexity = O(1)
// time complexity = O(NlogN)