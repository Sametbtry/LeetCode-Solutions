import move_zeroes.*;

public class move_zeroes_test {
    public static void main (String[] args){
        Solution1 solution = new Solution1();
        int[] nums = new int[] {1, 0, 7, 0, 2};
        solution.moveZeroes(nums);

        for(int num : nums)    System.out.println(num);
    }
}
