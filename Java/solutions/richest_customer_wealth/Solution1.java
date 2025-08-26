package solutions.richest_customer_wealth;

public class Solution1 {
    public int maximumWealth(int[][] accounts) {

        int maximumWealth = 0;
        int temp = 0;
        for (int customer = 0; customer < accounts.length; customer++) {
            for (int i = 0; i < accounts[customer].length; i++) {
                temp += accounts[customer][i];
            }
            maximumWealth = (temp > maximumWealth) ? temp : maximumWealth;
            temp = 0;
        }
        return maximumWealth;
    }
}

// time complexity = O(N**2)
// space complexity = O(1)
