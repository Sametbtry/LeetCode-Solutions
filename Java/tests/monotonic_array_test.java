import monotonic_array.*;

public class monotonic_array_test {   
    public static void main(String[] args){
        Solution1 solution = new Solution1();
        boolean result = solution.isMonotonic(new int[] {4,4,3,2});
        System.out.println(result); 
    }
}
