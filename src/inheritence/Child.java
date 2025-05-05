package inheritence;

public class Child extends Parent {

	public int a=20;

	@Override
	public void show() {
		System.out.println("Method in Child");
	}
	
	public void childShow() {
		System.out.println("Show of Child");
	}
}
