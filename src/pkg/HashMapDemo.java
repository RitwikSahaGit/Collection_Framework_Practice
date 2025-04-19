package pkg;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(30,  "Tania");
		map.put(1, "Ritwik");
		map.put(2, "Ankita");
		
		System.out.println(map);
		
		//Using loop in MAP--> map.keySet()
		for(int i: map.keySet()) {
			//System.out.println(map.get(i));
			System.out.println(i + ") " + map.get(i));
		}
		
		//Using loop in MAP--> map.entrySet()
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
			System.out.println("ID = " + entry.getKey());
			System.out.println("Value = " + entry.getValue());
		}
		
		System.out.println(map.containsKey(4)); //false
		System.out.println(map.containsValue("Ritwik")); //True
	}

}
