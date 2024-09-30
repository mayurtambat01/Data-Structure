//Longest Common Substrings.
/*
 * 
 */

package DynamicProgramming;

public class Lcs {

    public static int lcs(String s,String t){
        if (s.length()==0 || t.length()==0) {
            return 0;
        }
        if (s.charAt(0)==t.charAt(0)) {
            return 1 + lcs(s.substring(1), t.substring(1));
        }else{
            int op1 = lcs(s.substring(1), t);
            int op2 = lcs(s, t.substring(1));
            return Math.max(op1, op2);
        }
    }

    public static void main(String[] args) {
        String s = "dgei";
        String t = "begi";

        System.out.println(lcs(s, t));

    }    

}