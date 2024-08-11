/*
Given a string S, you need to remove all the duplicates. 
That means, the output string should contain each character only once. 
The respective order of characters should remain same, as in the input string.
*/

import java.util.HashMap;

public class ExtractUniqueCharacter {

    public static String UniqueCharacter(String str){
        HashMap<Character,Integer> map = new HashMap<>();

        String ans = "";
        for(int i=0;i < str.length();i++){
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            }else{
                ans = ans + c;
                map.put(c, 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "ABCDEFABCDEFGHIJGHIJKLMNKLMN";
        System.out.println(UniqueCharacter(str));
    }
}