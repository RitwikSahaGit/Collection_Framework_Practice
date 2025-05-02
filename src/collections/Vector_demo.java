package collections;

import java.util.Vector;

public class Vector_demo {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> vector = new Vector<>(); //Vector with default capacity 10;
		Vector<Integer> vector1 = new Vector<>(5); //Vector with fixed capacity 5;
		Vector<Integer> vector2 = new Vector<>(5,3); //Vector with fixed capacity 5, increaces by 3
		System.out.println("Capacity of the Vector1 " +vector1.capacity());
		int i=0;
		while(i<7) {
			vector1.add(i);
			i++;
		}
		
		System.out.println(vector1);
		System.out.println("Capacity of the Vector1 " +vector1.capacity());
	}

}
