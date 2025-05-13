package solutions.robot_return_to_origin;

public class Solution1 {
    public boolean judgeCircle(String moves) {
        int [] positions = {0,0};
        
        for(int i = 0 ;i < moves.length() ; i++) {
            char index = moves.charAt(i);

            switch (index) {
                case 'U':
                    positions[1] ++;
                    break;
                case 'D':
                    positions[1] --;
                    break;
                case 'R':
                    positions[0] ++;
                    break;
                case 'L':
                    positions[0] --;
                    break;
            }
        }
    
    if (positions[0] == 0 && positions[1] == 0) return true;
    else return false;
    }

}
