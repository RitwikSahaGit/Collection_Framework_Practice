package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>();//default size 10, increases by 1.5 time of the capa.
		
		//add in list
		list.add(3);
		list.add(5);
		list.add(10);
		list.add(4);
		
		System.out.println(list);
		
		//get a value
		System.out.println(list.get(3));
		
		//add element in between at any index;
		list.add(2, 7);
		System.out.println(list);
		
		//updating value at an index
		list.set(1, 6);
		System.out.println(list);
		
		//deleting a value
		list.remove(2);
		System.out.println(list);
		
		//iterating an Arraylist
		//Size function
		for(int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i)+ " ");
		}
		
		System.out.println();
		
		//Sorting an Arraylist with the Sort function
		//following are the alternate methods.
		Collections.sort(list);
		list.sort(null);
		System.out.println("List after sort " +list);
		
//		
//		list.addAll(list);
//		System.out.println(list);
		
		
		/* list declaration on the Fly*/
		//Arrays.asList()

		List<String> list1 = Arrays.asList("Sunday", "Monday");
		System.out.println(list1);
		
		String[] array = {"Tuesday","Wednesday"};
	    List<String> list2 = Arrays.asList(array); 
	    list2.set(1, "Thrusday"); //add method does not work with asList(), only set method works
	    System.out.println(list2);
	    
	    
	    //list.of()

	    List<Integer> listOf = List.of(1,2,3,4,5);
	    System.out.println(listOf);
	   //No operation can be performed as this is unmodifiable
	    ArrayList<Integer> al = new ArrayList<>(listOf);//list of can be modified with arraylist
	    al.add(6);
	    System.out.println(al);
	    
	    list.addAll(listOf);
	    System.out.println(list);
	    
	   System.out.println("At line number 79 " +list.indexOf(10)); 
	    
	    
	    
	    //removing an element with the value
	    List<String> newList = new ArrayList<>();
	    newList.addAll(list1);
	    newList.addAll(list2);
	    
	    newList.remove("Monday");
	    System.out.println(newList);
	    
	    System.out.println("Element of the List is " + list);
	    list.remove(Integer.valueOf(6));
	    System.out.println("Element of the List is " + list);
	
 
	}

}
