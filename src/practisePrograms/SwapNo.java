package practisePrograms;

public class SwapNo {

	public static void main(String[] args) {

usingTempVariable(10, 20);

withoutUsingTempVariable(15,30);
		
	}
	
	public static void withoutUsingTempVariable(int x, int y) {
		System.out.println("value of x before swaping :"+x);
		System.out.println("value of y before swaping :"+y);

		x=x+y;
		y=x-y;
		x=x-y;
		
		
		System.out.println("value of x After swaping :"+x);
		System.out.println("value of y After swaping :"+y);

		
	}

 
	public static void usingTempVariable(int x, int y) {
		
		int temp=0;
		System.out.println("value of x before swaping :"+x);
		System.out.println("value of y before swaping :"+y);

		temp=x;
		x=y;
		y=temp;
		
		System.out.println("value of x After swaping :"+x);
		System.out.println("value of y After swaping :"+y);

		
		
	}
	
}
