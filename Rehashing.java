package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * Why rehashing?

Rehashing is done because whenever key value pairs are inserted into the map, the load factor increases, which implies that the time complexity also increases as explained above. This might not give the required time complexity of O(1). 
Hence, rehash must be done, increasing the size of the bucketArray so as to reduce the load factor and the time complexity.

Rehashing can be done as follows:
1. For each addition of a new entry to the map, check the load factor.
2. If it’s greater than its pre-defined value (or default value of 0.75 if not given), then Rehash.
3. For Rehash, make a new array of double the previous size and make it the new bucketarray.
4. Then traverse to each element in the old bucketArray and call the insert() for each so as to insert it into the new larger bucket array.
 */
public class Rehashing {

	public static void main(String[] args) {
		Map<Integer,String> map = new Map<Integer,String>();
		 map.insert(1, "Ananya"); 
		 map.printMap();
		 map.insert(2, "AB"); 
		 map.printMap();
		 map.insert(3, "AB3"); 
		 map.printMap();
		 map.insert(4, "AB4"); 
		 map.printMap();
		 
		 
	}

}

class Map<K,V>{
	
	final double defaultLoadFactor = 0.75;
	ArrayList<MapNode<K,V>> buckets; 
	int numbuckets ;
	int size ;
	
	class MapNode<K,V>{
		public K key ;
		public V value ;
		public MapNode<K,V> next ;
		
		public MapNode(K key,V value){
			this.key = key;
			this.value = value;
			next = null;
		}
		
	}
	
	public Map() {
		numbuckets = 5;
		buckets = new ArrayList<>(numbuckets);
		
		for(int i =0;i<numbuckets;i++) {
			buckets.add(null);
			
		}
		
		 System.out.println("HashMap created");
	     System.out.println("Number of pairs in the Map: " + size);
	     System.out.println("Size of Map: " + numbuckets);
	     System.out.println("Default Load Factor : " + defaultLoadFactor + "\n");
	}

	public void insert(K key, V value) {
		int bucketInd = getBucketIndex(key);
		
		MapNode<K,V> head = buckets.get(bucketInd);
		
		while(head!=null) {
			if(head.key == key) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		
		MapNode<K,V> newElementNode = new  MapNode<K,V>(key,value);
	    head = buckets.get(bucketInd);
	    newElementNode.next = head;
	    
	    System.out.println("Pair(" + key + ", " + value + ") inserted successfully.\n");
	    size++;
	    double curloadFactor = (1.0*size)/numbuckets;
	    System.out.println("Current Load factor = " + curloadFactor);
	    
	    if(curloadFactor >defaultLoadFactor) {
	    	
	    	System.out.println(curloadFactor + " is greater than " + defaultLoadFactor +" so rehashing done");
            
	    	rehash();
	    	 System.out.println("New Size of Map: " + numbuckets + "\n");
	    }
	    
	    System.out.println("Number of pairs in the Map: " + size);
        System.out.println("Size of Map: " + numbuckets + "\n");
	}

	private void rehash() {
		System.out.println("\n***Rehashing Started***\n");
		
		ArrayList<MapNode<K,V>> temp =  buckets;
		buckets = new ArrayList<>(2*numbuckets);
		
		for(int i =0;i<2*numbuckets;i++) {
			buckets.add(null);
			
		}
		size = 0;
		numbuckets = numbuckets*2;
		
		for(int i =0;i<temp.size();i++) {
			MapNode<K,V> head = temp.get(i);
			while(head!=null) {
				K key = head.key;
				V value = head.value;
				
				insert(key,value);
				head = head.next;
			}
		}
		System.out.println("\n***Rehashing Ended***\n");
	}

	private int getBucketIndex(K key) {
		
		return (key.hashCode() % numbuckets);
	}

	public void printMap() {
		//System.out.println("Entered");
		ArrayList<MapNode<K,V>> temp =  buckets;
		for(int i =0;i<temp.size();i++) {
			MapNode<K,V> head = temp.get(i);
		//	System.out.println("head"+head);
			while(head!=null) {
				System.out.println("Key ::"+head.key+"::Value::"+head.value);
				head = head.next;
			}
		}
	}
	
	
	
	
}