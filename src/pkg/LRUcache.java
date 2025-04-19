package pkg;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUcache<K,V> extends LinkedHashMap<K, V>{

	
	private int capacity;
	
	public LRUcache(int capacity) {
		super(capacity, .75f, true);
		this.capacity = capacity;
	}
	

	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		// TODO Auto-generated method stub
		//return super.removeEldestEntry(eldest);
		System.out.println(eldest);
		//System.out.println();
		return size()> capacity;
		
		/*If size of the linkeHashmap is greater than the capacity mentioned.
		 * Then the Least recently used element should be eliminated.
		 * means the eldest element is removed form the LinkedHashMap.*/
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LRUcache<String, Integer> lru = new LRUcache<>(3);
			lru.put("Ritwik", 1997);
			lru.put("Ankita", 1998);
			lru.put("Supratim", 1997);
			lru.put("Rikta", 2001);
			//when Rikta is added till then Ritwik is the Least used. So Ritwik is removed. as adding Rikta increases the Size than capacity.
			//here Ritwik is eldest element so it is removed.
			System.out.println();
			
			for(Map.Entry<String, Integer> entry: lru.entrySet()) {
				System.out.println(entry.getKey() + "= " +entry.getValue());
				
			}
	}

}
