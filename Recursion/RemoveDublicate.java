import java.util.Scanner;

public class RemoveDublicate {

    public static String removeDuplicate(String str){
        if (str.length()==1) {
            return str;
        }
        if (str.charAt(0)==str.charAt(1)) {
            return removeDuplicate(str.substring(1));
        }
        return str.charAt(0) + removeDuplicate(str.substring(1));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(removeDuplicate(str));
    }
}
