import java.util.Scanner;

public class PrintNodeAtK {

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
    public static void printAtK(TreeNode<Integer> root,int k){
        if (k < 0) {
            return;
        }
        if(k==0){
            System.out.println(root.data);
            return;
        }
        for(int i=0;i < root.children.size();i++){
            printAtK(root.children.get(i), k - 1);
        }
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInput();
        printAtK(root, 2);
    }
}
