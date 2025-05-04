import find_the_difference.*;	

public class find_the_difference_test {
    public static void main (String[] args){
        Solution2 solution = new Solution2();
        char result = solution.findTheDifference("abc", "abcd");
        System.out.println(result);
    }
}
