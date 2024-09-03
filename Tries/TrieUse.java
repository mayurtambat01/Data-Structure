
public class TrieUse {
    
    public static void main(String[] args) {
        Trie t = new Trie();
        t.add("hello");
        t.add("news");

        System.out.println(t.search("hello"));
    }
}