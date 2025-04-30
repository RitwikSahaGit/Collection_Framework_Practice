package patternPrinting;


public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println("rightHalfPyramid");
		rightHalfPyramid(8);
		System.out.println("invertedRightHalfPyramid");
		invertedRightHalfPyramid(8);
		System.out.println("leftHalfPyramid");
		leftHalfPyramid(4);
		System.out.println("revartedLeftHalfPyramid");
		revartedLeftHalfPyramid(4);
		System.out.println("solidRectangle");
		solidRectangle(10);
		System.out.println("hollowRectangle");
		hollowRectangle(4,5);
		System.out.println("leftHalfDiamond");
		leftHalfDiamond(5);

	}
	
	public static void rightHalfPyramid(int n) {
//	    *
//		**
//		***
//		****
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10
		//int num = 1;
		for(int i = 1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void invertedRightHalfPyramid(int n) {
//		*****
//		****
//		***
//		**
//		*
		
//		for(int i = n; i>0; i--) {
//			for(int j = i; j>0; j-- ) {
//				System.out.print("*");
//				
//			}
//			System.out.println();
//		}
		for(int i = n; i>0; i--) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	
	}
	public static void leftHalfPyramid(int n) {
		
//		   *s=3, *=1 total=n=4
//		  **s=2, *=2 total=n=4
//		 ***s=1, *=3 total=n=4
//		****s=4, *=0 total=n=4
		for(int i = 1; i<=n; i++) {
			//inner loop for space printing
			for(int j= 1; j<=n-i; j++) {
				System.out.print(" ");
			}
			//inner loop for star printing
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
	}
	
	public static void revartedLeftHalfPyramid(int n) {
//		**** s=0, *=4 total=n=4
//		 *** s=1, *=3 total=n=4
//		  ** s=2, *=2 total=n=4
//		   * s=3, *=1 total=n=4
		for(int i = 0; i<n; i++) {
			//inner loop for space printing
			for(int j = 1; j<=i;j++) {
				System.out.print(" ");
			}
			//inner loop for star printing
			for(int j = 1; j<=n-i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void solidRectangle(int n) {
		for(int i=0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	
			
	}
	public static void hollowRectangle(int r, int c) {
		
		for(int i=1; i<=r; i++) {
			for(int j = 1; j<=c; j++) {
				if(i==1 || j==1 || i==r||j==c) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
	
	private static void leftHalfDiamond(int n) {
		// TODO Auto-generated method stub

		for(int i = 1; i<=n; i++) {
//			for(int j = n-1; j>i; j--) {
//				System.out.print(" ");
//			}
//			for(int j = 0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
			for(int j= 1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(int i = 0; i<n; i++) {
			
			for(int j = 1; j<=i;j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=n-i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	
}
	


