package to_lower_case;

public class Solution2 {
    public String toLowerCase(String s) {
        int len = s.length();
        StringBuilder str = new StringBuilder(); // O(n) space and O(1) time
        for(int i = 0; i<len; i++){
            int ascii = (int)s.charAt(i);
            if(ascii >= 65 && ascii <= 90){
                ascii += 32;
                char a = (char)ascii;
                str.append(a);
            }else{
                char a = (char)ascii;
                str.append(a);
            }
        }
        return str.toString();  // O(n) time and space
    }
}

//time ve sapace O(n)


