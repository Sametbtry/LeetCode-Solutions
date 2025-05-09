package tests;

import solutions.baseball_game.*;

public class Baseball_game_test {
    public static void main(String[] arrgs) {
        Solution1 solution = new Solution1();
        String[] opertations = {"5","2","C","D","+"};  
        System.out.println(solution.calPoints(opertations));
    }
}
