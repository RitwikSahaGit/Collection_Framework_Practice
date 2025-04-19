package pkg;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str= new String(" Ritwik");
//		String[] arr = str.split("t");
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		
//		String str2 = str.substring(2, 4); //gives the substring
//		System.out.println(str2);
//		
//		String str3 = str.repeat(2);//repeats the string
//		System.out.println(str3);
//		
//		String str4 = str.strip();
//		System.out.println(str4);
		
//		String name = "Ritwik";
//		name.concat("Saha");
//		System.out.println(name);
		
		StringBuilder name = new StringBuilder();
		name.append("Ritwik");
		name.append("Saha");
		
		//name.insert(3, "saha");
		System.out.println(name);
		
		System.out.println(name.reverse());
		
		String textBlock = """
				hbcjhwbc
				hkdcbhjwcb
				whjvdchgwvc
				whjcbj
				""";
		
		System.out.println(textBlock);
				
	}

}
