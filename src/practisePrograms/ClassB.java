package practisePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassA a=new ClassA("Asha",25,true);
System.out.println(a.getName());
System.out.println(a.getNum());
System.out.println(a.isFlag());
int[] arr = {5,42,6,60,10} ;
System.out.println(largestNumber(arr));


	}

	public static int  largestNumber(int[] array) {
		
	Arrays.sort(array);
	
	for(int a:array) {
	System.out.println(a);
	}
	System.out.println("Largest is :"+array[array.length-1]);
	int largest =array[0];
		for (int i=1;i<array.length;i++) {
			if(array[i]>largest) {
				largest=array[i];
			}
		}
		return largest;
	}
	
	
}
