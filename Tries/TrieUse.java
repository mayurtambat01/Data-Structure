
public class TrieUse {

    public static void main(String[] args) {
        Trie t = new Trie();
        
        t.add("akm");
        t.add("awm");

        System.out.println(t.search("akm"));

        t.remove("akm");

        System.out.println(t.search("akm"));
    }    
}