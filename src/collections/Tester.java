package collections;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSum obj= new TwoSum();
		int nums[]= {0,3,1,3};
		int arr[] = new int[2];
		arr = obj.twoSum(nums, 6);
		
		//System.out.println(arr);
		for(int i= 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
