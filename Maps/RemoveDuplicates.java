import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {

    public static ArrayList<Integer> removeDuplicate(int a[]){
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer , Boolean> seen = new HashMap<>();
        for(int i=0;i < a.length;i++){
            if (seen.containsKey(a[i])) {
                continue;
            }
            output.add(a[i]);
            seen.put(a[i] , true);
        }
        return output;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,4,3,66,2,1};
        ArrayList<Integer> output = removeDuplicate(a);
        for(int i=0;i < output.size();i++){
            System.out.print(output.get(i)+" ");
        }
    }
}