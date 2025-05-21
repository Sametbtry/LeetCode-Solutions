package solutions.find_winner_on_a_tic_tac_toe_game;

public class Solution1 {
    public String tictactoe (int[][] moves) {

        char [][] area = new char [3][3];

        for (int i = 0 ; i < moves.length ; i++ ) {
            if (i % 2 == 0)   area[moves[i][0]] [moves[i][1]] = 'X';
            else area[moves[i][0]] [moves[i][1]] = 'O';
        }

        // for (int i = 0 ; i < area.length ; i++) {
        //     System.out.println();
        //     for (int j = 0 ; j < area[0].length ; j++){
        //         System.out.print(area[i][j] + " ");
        //     }
        // }
        // System.out.println();

        // sutun
        if (area [0][0] == area [1][0] && area [1][0] == area [2][0] && area [0][0] != 0 ) {
            if (area [0][0] == 'X') return "A";
            else return "B";
        }

        if (area [0][1] == area [1][1] && area [1][1] == area [2][1] && area [0][1] != 0 ) {
            if (area [0][1] == 'X') return "A";
            else return "B";
        }

        if (area [0][2] == area [1][2] && area [1][2] == area [2][2] && area [0][2] != 0 ) {
            if (area [0][2] == 'X') return "A";
            else return "B";
        }

        // satir
        for(int i = 0 ; i < area.length ; i++) {
            char control = area[i][0];
            if (control == 0) continue;
            int sayac = 0;
            for (int j = 0 ; j < area[0].length ; j++) {
                if( control == area[i][j])    sayac ++;
            }
            if (sayac == 3){
                if (control == 'X') return "A";
                else return "B";
            }
        }

        // diagonal
        if (area [0][0] == area [1][1] && area [1][1] == area [2][2] && area [0][0] != 0 ) {
            if (area [0][0] == 'X') return "A";
            else return "B";
        }

        if (area [0][2] == area [1][1] && area [1][1] == area [2][0] && area [0][2] != 0 ) {
            if (area [0][2] == 'X') return "A";
            else return "B";
        }

        if ( moves.length < 9 ) return "Pending";
        return "Draw";
    }
}

// time complexity = O(1) cunku for un dongu sayisi sabit 
// space complexity = O(1)

// icime sinen bir cozum olmadi, okunabilirlik cok dusuk.