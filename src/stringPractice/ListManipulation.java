package stringPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> originalList = Arrays.asList(1,2,3,4,5,6);
		List<Integer> reversedList = new ArrayList<>(originalList);
        Collections.reverse(reversedList);
        
        System.out.println(reversedList);
	}

}
