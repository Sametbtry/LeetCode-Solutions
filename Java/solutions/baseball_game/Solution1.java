package solutions.baseball_game;

import java.util.ArrayList;

public class Solution1 {
    public int calPoints(String[] opertations) {

        int result = 0;
        String index;
        ArrayList<Integer> record = new ArrayList<Integer>();

        for (int i = 0; i < opertations.length; i++) {

            index = opertations[i];
            if (index.equals( "C")) {
                record.removeLast();

            } else if (index.equals( "D")) {
                    record.add(record.getLast() * 2);

            } else if (index.equals( "+")) {
                    record.add(record.getLast() + record.get(record.size()-2));

            } else {
                    // record.add((int)(index.charAt(0))); // sayinin ASCII degerini int olaraka alir
                    record.add(Integer.parseInt(index));

            }
        }
        
        for (int num : record) result += num;

        return result;
    }
}

// time ve space complexity O(n)
// switch case yapisina daha uygun bir soru // okunabilirlik acisindan