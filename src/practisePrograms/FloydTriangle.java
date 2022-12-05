package practisePrograms;

public class FloydTriangle {

	public static void main(String[] args) {
floydTriangle();
	}
public static void floydTriangle() {
	int count=1;
	for(int i=1;i<=10;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(" *");
		}
		System.out.println();
	}
}
}
