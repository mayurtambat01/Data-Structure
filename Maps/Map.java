// HashMap Implementation.

import java.util.ArrayList;

public class Map<K,V> {

    ArrayList<MapNode<K,V>> buckets;
    int numBuckets;
    int size;

    public Map(){
        numBuckets = 20;
        buckets = new ArrayList<>();
        for(int i=0;i < 20;i++){
            buckets.add(null);
        }
    }

    private int hasBucketIndex(K key){
        int hashCode = key.hashCode();
        return hashCode % numBuckets;
    }
    public void insert(K key,V value){
        int bucketIndex = hasBucketIndex(key);
        MapNode<K,V> head = buckets.get(bucketIndex);
        while (head != null){
            if (head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }
        head = buckets.get(bucketIndex);
        MapNode<K,V> newElementNode = new MapNode<K,V>(key, value);
        newElementNode.next = head;
        buckets.set(bucketIndex, newElementNode);
    }

    public int size(){
        return size;
    }
    public V getValue(K key){
        int bucketIndex = hasBucketIndex(key);
        MapNode<K,V> head = buckets.get(bucketIndex);
        while (head != null){
            if (head.key.equals(key)){
                return head.value;
            }
            head = head.next;
        }
        return null;
    }
    public V removeKey(K key){
        int bucketIndex = hasBucketIndex(key);
        MapNode<K,V> head = buckets.get(bucketIndex);
        MapNode<K,V> prev = null;
        while (head != null){
            if (head.key.equals(key)){
                if (prev == null) {
                    buckets.set(bucketIndex, head.next);
                }else{
                    prev.next = head.next;
                }
                return head.value;
            }
            prev = head;
            head = head.next;
        }
        return null;
    }
}