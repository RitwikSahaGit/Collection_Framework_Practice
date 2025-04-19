package inheritence;

public class BoxWeight extends Box {
	
	private double weight; //weight
	
	BoxWeight(){
		System.out.println("BoxWeight default Constructor");
	}
	
	BoxWeight(double h, double w, double d, double weight){
		
		super(h,w,d);
		this.weight = weight;
		System.out.println("BoxWeight Prameterised Constructor");
	}
	
	//overrides the method of Box class
	public void show() {
		super.show();
		System.out.println(weight);
	}
	
	//this id overloading
	public void show(String string) {
		System.out.println("String passed " + string);
	}

}
