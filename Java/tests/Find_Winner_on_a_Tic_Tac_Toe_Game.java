package tests;
import solutions.find_winner_on_a_tic_tac_toe_game.*;

public class Find_Winner_on_a_Tic_Tac_Toe_Game {
    public static void main (String[] args) {
        Solution1 solution1 = new Solution1();
        String result = solution1.tictactoe(new int[][] {{2,2},{1,2},{2,1},{1,1},{2,0}});
        System.out.println(result);
    }
}
