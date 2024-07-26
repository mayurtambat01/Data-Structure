
public class SubSequencePrint {

    public static void print(String input){
        print(input, "");
    }
    public static void print(String input,String outputSofar){
        if (input.length()==0) {
            System.out.println(outputSofar);
            return;
        }
        print(input.substring(1), outputSofar);
        print(input.substring(1), outputSofar + input.charAt(0));
    }

    public static void main(String[] args) {
        print("Mayur");
    }
}
