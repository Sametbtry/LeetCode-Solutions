package canMakeArithmeticProgressionFromSequence;

import java.lang.reflect.Array;
import java.util.Arrays;

class Solution1 {
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

    public static void main(String[] args){
        Solution1 solution = new Solution1();
        boolean result = solution.canMakeArithmeticProgression(new int[] {1,2,4});
        System.out.println(result);
    }
}
// sapace complexity = O(1)
// time complexity = O(NlogN)