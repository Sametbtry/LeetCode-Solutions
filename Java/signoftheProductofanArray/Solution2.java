package signoftheProductofanArray;

public class Solution2 {
    public int arraySign(int[] nums){
        int negatifCount = 0;
        for(int num : nums){
            if (num == 0) return 0;
            
            if(num < 0) negatifCount ++;
        }
        if (negatifCount % 2 == 0) return 1;
        else return -1;
    }
    public static void main(String[] args){
        Solution2 solution = new Solution2();
        int result = solution.arraySign(new int[] {9,72,34,29,-49});
        System.out.println(result);
    }
}

/*
time complexity : O(n)

space complexity : 0(1)
 */