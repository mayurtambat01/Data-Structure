
public class MapUse {

    public static void main(String[] args) {
        Map<String , Integer> map = new Map<>();
        for(int i=0;i < 15;i++){
            map.insert("ABC" + i,1 + i);
        }
        map.removeKey("ABC2");
        map.removeKey("ABC3");

        for(int i=0;i < 15;i++){
            System.out.println("ABC" + i + ":" + map.getValue("ABC" + i));
        }
    }
}