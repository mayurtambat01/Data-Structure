
import java.util.Scanner;

public class TakeUserInput {

    public static TreeNode<Integer> takeInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Next Node Data");
        int n=s.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(n);
        System.out.println("Enter Number Of Child "+n);
        int childCount = s.nextInt();
        for(int i=0;i < childCount;i++){
            TreeNode<Integer> child = takeInput();
            root.children.add(child);
        }
        return root;
    }
    public static void print(TreeNode<Integer> root){
        String s = root.data + ":";
        for(int i=0;i < root.children.size();i++){
            s += root.children.get(i).data + ",";
        }
        System.out.println(s);
        for(int i=0;i < root.children.size();i++){
            print(root.children.get(i));
        }
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInput();
        print(root);
    }  
}