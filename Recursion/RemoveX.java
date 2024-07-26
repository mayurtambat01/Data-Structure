import java.util.Scanner;

public class RemoveX {

    public static String remove(String str){
        if (str.length()==0) {
            return str;
        }
        String ans = "";
        if (str.charAt(0) != 'x') {
            ans += str.charAt(0);
        }
        String smallAns = remove(str.substring(1));
        return ans + smallAns;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(remove(str));
    }
}
