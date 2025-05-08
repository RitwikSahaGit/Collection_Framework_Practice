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
		
		
		System.out.println();
		System.out.println("Is Palindrom??");
		isPalindrom("abcba");
		
		System.out.println();
		System.out.println("Reversal of a String");
		stringReverseAlternate("abcd");
		

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
	
	public static void isPalindrom(String s ) {
		int start = 0;
		int end = s.length()-1;
		
		boolean flag = false;
		while(start<end) {
			if(s.charAt(start)!=s.charAt(end)) {
				flag=true;	
			}
			start++;
			end--;
		}
		if(flag) {
			System.out.println("Not Palindrom");
		}
		else {
			System.out.println("Palindrom");
		}
	}
	
	public static void stringReverseAlternate(String s) {
		int start = 0;
		int end = s.length()-1;
		char[] arr = s.toCharArray();
		while(start<end) {
			char temp= arr[start];
			arr[start]  = arr[end];
			arr[end] = temp;
			start++; end--;
		}
		System.out.println(arr);
	}

}
