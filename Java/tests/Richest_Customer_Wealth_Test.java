package tests;

import solutions.richest_customer_wealth.*;

public class Richest_Customer_Wealth_Test {
    public static void main(String[] args) {
        Solution1 S1 = new Solution1();
        System.out.println(S1.maximumWealth(new int[][]{{1,2,3},{1,2,5},{1,2,4}}));
    }
}
