package pkg;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>(3, 0.75f, true);
		linkedHashMap.put(32, "Tania");
		linkedHashMap.put(21, "Ritwik");
		linkedHashMap.put(29, "Ankita");
		//Linked Hash Map always follow the insertion order
		//bcz it used doubley linked list
		System.out.println(linkedHashMap);
		
//		HashMap<Integer, String> hashMap = new HashMap<>();
//		hashMap.put(101,  "Tania");
//		hashMap.put(10, "Ritwik");
//		hashMap.put(2, "Ankita");
//		//Does not follow any order
//		System.out.println(hashMap);
		linkedHashMap.get(21);//if the access order in "True" in the constructor. then the recently used element comes at the last of the LinkedHashmap.
		//This mechanism can be used at the time of identifying the Least Recent used element in the Linkedhashmap.
		//The least recently used element goes at the top of the LinkedHashMap. So we can see the top element to Identify the Least Recently Used element in the LinkedHashMap.
		//linkedHashMap.remove
		System.out.println("Linked Hash Map");
		for(Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
		
		linkedHashMap.putIfAbsent(21, null);
		linkedHashMap.putIfAbsent(22, "Supratim");
		System.out.println(linkedHashMap);
		
		String res = linkedHashMap.getOrDefault(32, null);
		String res1 = linkedHashMap.getOrDefault(33, null);
		System.out.println(res);
		System.out.println(res1);
		
		
	}
}
