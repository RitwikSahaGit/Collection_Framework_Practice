package collections;

import java.util.Arrays;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();// Empty linked list created
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		System.out.println(ll);
		
		ll.addFirst(0);
		System.out.println(ll);
		
		ll.addLast(4);
		System.out.println(ll);
		
		ll.add(3, 20);
		System.out.println(ll);
		
		ll.remove(4);
		System.out.println(ll);
		
		ll.remove(ll.indexOf(20));
		System.out.println(ll);
		
		LinkedList<String> animallist = new LinkedList<String>(Arrays.asList("cow", "cat", "dog"));
		System.out.println(animallist);
		LinkedList<String> removelist = new LinkedList<String>(Arrays.asList("dog", "lion"));
		System.out.println(removelist);
		
		animallist.removeAll(removelist);
		System.out.println(animallist);
		
	
	}
	

}

