import java.util.HashMap;
import java.util.Set;

public class HashMapUse {

    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();

        //Insert.
        map.put("ABC", 1);
        map.put("DEF", 2);

        //Check Size.
        System.out.println(map.size());
    
        //Check Presence.
        if (map.containsKey("ABC")) {
            System.out.println("HAS ABC");
        }
        if (map.containsKey("ABC1")) {
            System.out.println("HAS ABC1");
        }

        //Remove.
        int v = map.remove("DEF");
        System.out.println(v);

        Set<String> keys = map.keySet();
        for(String str : keys){
            System.out.println(str);
        } 
    }
    
}