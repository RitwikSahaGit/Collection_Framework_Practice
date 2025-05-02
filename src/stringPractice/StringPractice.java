package stringPractice;

import java.util.Arrays;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//remove all trailing slash
		String str = "https://github.com/RitwikSahaGit////";
		str= str.replaceAll("/+$", "");
		System.out.println(str);
		//op = https://github.com/RitwikSahaGit
		
		//remove all the slashes from the string
		
		str=str.replaceAll("/", "");
		System.out.println(str);
		//op= https:github.comRitwikSahaGit
		
		//string reversal
		System.out.println();
		stringReverse("H llo");
//		op 
//		Original String H llo
//		Reversed String oll H
		
		//Anagram Check
		System.out.println();
		System.out.println("Anagram Check");
		String str1 = "Rit wik";
		String str2 = "KI   WIR";
		System.out.println("Anagram? " +anagramCheck(str1, str2));
//		output 
//		Anagram Check
//		Length Mismatch
//		Anagram? false
		System.out.println();
		System.out.println("Anagram Check");
		String str3 = "Rit wik";
		String str4 = "KIt  WIR";
		System.out.println("Anagram? " +anagramCheck(str3, str4));
//		output 
//		Anagram Check
//		Anagram? true
		
		


	}
	
	public static void stringReverse(String str){
		
		String reversedString = "";
		
		for(int i = 0; i<str.length(); i++) {
			reversedString = str.charAt(i) + reversedString;
		}
		System.out.println("Original String " + str);		
		System.out.println("Reversed String " + reversedString);	
	}
	
	
	public static boolean anagramCheck(String str1, String str2) {
		
		str1 = str1.toUpperCase().replaceAll("\\s", "");
		str2 = str2.toUpperCase().replaceAll("\\s", "");
		
		if(str1.length()!=str2.length()) {
			System.out.println("Length Mismatch");
			return false;
		}
		
		
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
//		if(Arrays.toString(charArray1).equals(Arrays.toString(charArray2))) {
//			return true;
//		}
//		
//		Above if condition can be written as the below
//		if(Arrays.equals(charArray1, charArray2)) {
//			return true;
//		}
//		The above if condition can be derived as below
		return Arrays.equals(charArray1, charArray2);
		
	}
	


}
