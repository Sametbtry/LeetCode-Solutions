package solutions.robot_bounded_in_circle;

public class Solution1 {
    public boolean isRobotBounded(String instructions) {

        int[][] coord = new int[][] { { 0, 1 }, { -1, 0 }, { 0, -1 }, { 1, 0 } };
        int coordIndex = 0, x = 0, y = 0;

        for (int i = 0; i < instructions.length(); i++) {
            if (instructions.charAt(i) == 'L') {
                // coordIndex++; // coord sinirlari tasar
                coordIndex = (coordIndex + 1) % 4; // 4 ile mod aliyorumm cunku coordIndex 3'u gecmemeli.
            } else if (instructions.charAt(i) == 'R') {
                // coordIndex--; // coord sinirlari tasar
                coordIndex = (coordIndex + 4 - 1) % 4; // ilk R ,tersten (index = 3) baslamali
            } else {
                x += coord[coordIndex][0];
                y += coord[coordIndex][1];
            }
        }

        if (x == y && x == 0) return true;
        return !(coordIndex == 0);
    }
}

/* 
time = O(n)
space = O(1)
 */

