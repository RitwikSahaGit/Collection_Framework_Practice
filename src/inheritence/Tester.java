package inheritence;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent obj = new Child();
		System.out.println(obj.a);
		//instance variable gets called from the Parent/Reference
		obj.show();//methods gets called of Child
		
		//obj.childShow();// This is not possible as Parent does not have this method
	}

}
