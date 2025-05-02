package stringPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Reverse a list
		List<Integer> originalList = Arrays.asList(1,2,3,4,5,6);
		List<Integer> reversedList = new ArrayList<>(originalList);
        Collections.reverse(reversedList);
        
        System.out.println(reversedList);
        
        List<String> listOfString = Arrays.asList("Rit", "Anki", "Sup");
        Collections.reverse(listOfString);       
        System.out.println(listOfString);
        
        
        //Check for missing number
        int[] arr= {1, 2, 3, 5};
        System.out.println("checkForMissingNumber");
        checkForMissingNumber(arr);
        
        
	}
	
//			Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
//			Output: 6
//			Explanation: All the numbers from 1 to 8 are present except 6.
//
//
//			Input: arr[] = [1, 2, 3, 5]
//			Output: 4
//			Explanation: Here the size of the array is 4, so the range will be [1, 5]. The missing number between 1 to 5 is 4
	public static void checkForMissingNumber(int[] arr){
		int length = arr.length+1; 
		//[1, 2, 3, 5] length = 4. as 1 element is missing so the length we have to check 1 more.
		
		
		for(int i = 1; i<=length; i++) {
			boolean flag = false;
			
			for(int j= 0; j<arr.length; j++ ) 
			{
				if(arr[j] == i) 
				{
					flag=true;//when ever any value is found in array this flag is true.
				}
			}
			
			
			if(!flag) {
				System.out.println(i);
			}
		}		
		
    }
}


