package repeated_substring_pattern;

import java.util.ArrayList;

public class Solution1 {
    public boolean repeatedSubstringPattern(String s) {
        int size = s.length();
        String subString;

        ArrayList<Integer> bolenler = new ArrayList<Integer>();
        ArrayList<String> SubStrings = new ArrayList<String>();

        boolean kontrol = false;
        
        for (int i = 1 ; i <= Math.sqrt(size) ; i++)
        {
            if (size % i == 0)
            {
                bolenler.add(i);
                if (size / i != i) bolenler.add(size/i);
            }
        }
        for(int num : bolenler)
        {
            if (num > size/2) continue;

            SubStrings.clear();

            for(int i = 0; i + num <= size; i+= num)
            {
                subString = s.substring(i, i + num); 
                SubStrings.add(subString);
            }

            kontrol = true;
            String denek = SubStrings.get(0);

            for(String Str : SubStrings)
            {
                if(!Str.equals(denek))   
                {
                    kontrol = false;
                    break;
                }
            }

            if(kontrol)    break;
        }
        return kontrol;
    }
}
/*
Benim cozumum
 */


