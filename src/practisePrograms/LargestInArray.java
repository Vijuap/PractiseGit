package practisePrograms;


public class LargestInArray {

	public static void main(String[] args) {
int array[]= {1,5,8,10,12,30,0};
System.out.println(largestInArray(array));
System.out.println(smallestInArray(array));
largestAndSmallestNo(5,8,6);
	}
public static int largestInArray(int arr[]) {
	int largest=arr[0];
	for (int i =1;i<arr.length;i++) {
			if (arr[i]>largest)	{
				largest= arr[i];
			}
		}
	
	
	return largest;
	
	
	
}

public static void largestAndSmallestNo( int x,int y, int z) {
	if (x>y&&x>z) {
		System.out.println("largest is x="+x);
	}else if (y>x&&y>z) {
		System.out.println("largest is y="+y);
	}else if (z>x&&z>x) {
		System.out.println("largest is z="+z);
	}
}
public static int smallestInArray(int arr[]) {
	
	int smallest=arr[0];
	for (int i =1;i<arr.length;i++) {
		if (arr[i]<smallest)	{
				smallest= arr[i];
				
			}
		}
	
	
	
	return smallest;
	
	
	
}
}
