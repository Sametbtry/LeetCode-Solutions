package signoftheProductofanArray;

class Solution1{
    public int arraySign(int[] nums){

        long result = 1;

        for(int num : nums){
            result *= num;
        }
        if (result > 0) return 1;
        else if (result < 0) return -1;
        else return (int) result;

    }

    public static void main(String[] args){
        Solution1 solution = new Solution1();
        int result = solution.arraySign(new int[] {9,72,34,29,-49,-1});
        System.out.println(result);
    }
}

/*
time complexity : O(n)

space complexity : 0(1)

long integer overflow (tamsayı taşması) riski
 */