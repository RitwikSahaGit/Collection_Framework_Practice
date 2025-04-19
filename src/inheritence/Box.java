package inheritence;

public class Box {
	
	private double h; //height
	private double w; // width
	private double d; //depth
	
	Box(){
		System.out.println("Default constructor of Box Class");
		h=w=d=-1;
	}
	
	Box(double len){
		System.out.println("Cube constructor of Box Class");
		h=w=d=len;
	}
	
	Box(double h, double w, double d){
		System.out.println("Rectagular constructor of Box Class");
		this.h = h;
		this.w= w;
		this.d = d;
	}
	
	public void vol() {
		System.out.println("Volume of the Box is: " + h*w*d);
	}
	
	public void show() {
		System.out.println("The dimensens are : ");
		System.out.println(h);
		System.out.println(w);
		System.out.println(w);
	}

}
