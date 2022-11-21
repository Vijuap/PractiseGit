package practisePrograms;
import java.lang.*;
import java.sql.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("reverseEveryCharacterInString : : "+reverseEveryCharacterInString("Hello World"));
		System.out.println("swapTwoNumbersWithoutUsingAThirdVariable: :"+swapTwoNumbersWithoutUsingAThirdVariable(10,20));
		System.out.println("stringContainsVowels: :"+stringContainsVowels("Hello World"));
		System.out.println("Is prime: :"+isPrime(37));
		fibonacciSeries(10);
		System.out.println();
		System.out.println("checkPalindromeString: :"+checkPalindromeString("GaDag"));
		System.out.println("removeWhiteSpaces : :"+removeWhiteSpaces("Hello World"));
		System.out.println("removeWhiteSpacesFromStartAndEndOfString : :"+removeWhiteSpacesFromStartAndEndOfString("   Hello World    "));
	int[] array1= {2,5,8,9,56,10,82,20,2};
	System.out.println("sortAnArray: :"+sortAnArray(array1));
	System.out.println("binary search in an array Position::"+binarySearchInArray(array1, 20) );
	
	System.out.println("factorialOfANumber : :"+factorialOfANumber(5));
	
	LinkedList<Integer> linkedList2 =new LinkedList<>();
	linkedList2.add(58);
	
	System.out.println("reverseLinkedList : :"+reverseLinkedList(linkedList2));

	
	}
	
	public static String reverseEveryCharacterInString(String str) {
		String rev="";
		
		for (int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			rev+=ch;
					
		}
		return rev;

	}
	public static boolean stringContainsVowels(String str) 
	{
		boolean flag=false;
		for (int i=0;i<=str.length()-1;i++) {
			str.toLowerCase();
			char ch =str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				 flag=true;
				break;
			}else flag=false;
		}
		return flag;
	}
	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
	public static String  swapTwoNumbersWithoutUsingAThirdVariable(int a, int b) {
	b=b+a;
	a=b-a;
	b=b-a;
	String str="a= "+a+" & b= "+b ;
		return str;
		
		
	}
	public static void  fibonacciSeries(int n) {
		int a=0;
		int b=1;
		int c =0;
		for(int i=0;i<=n-1;i++) {
			
			System.out.print(a+" ,");
           c=a+b;
			a=b;
			b=c;

		}

	}
	public static boolean checkPalindromeString(String str) {
		boolean flag=false;
		for(int i =0;i<=(str.length())/2;i++) {
			char ch1=str.charAt(i);
			char ch2=str.charAt(str.length()-1-i);
			if (ch1==ch2) {
				flag=true;
				
			}else flag=false;
		}
		return flag;
	}
	public static String removeWhiteSpaces(String str){
		String str2="";
	char c1[]=str.toCharArray();
		for(char c: c1) {
			if(c==' ')
			{
				continue;
			}
			else
			{		
				str2+=c;
			}
		}
		return str2;
	}
	public static String removeWhiteSpacesFromStartAndEndOfString(String str){
		String str1=str.strip();
		return str1;
	}

public static String sortAnArray(int[] arr) {
Arrays.sort(arr);
	return Arrays.toString(arr);
	}

public static int factorialOfANumber(int n) {
	if (n==1) {
		return n;
		
	}else {
		return n*factorialOfANumber(n-1);
		
	}
}

public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> linkedList) {
	linkedList.add(5);
	linkedList.add(6);
	linkedList.add(4);
	linkedList.add(8);
	linkedList.add(1);
 
	System.out.println("Linked List ::"+linkedList);
	
	LinkedList<Integer> linkedList1 =new LinkedList<>();
	linkedList.descendingIterator().forEachRemaining(linkedList1::add);
	
	System.out.println("Linked list 1 : : "+linkedList1);
return linkedList1;
}

public static int binarySearchInArray(int[] array1,int key ) {
int mid=0;
int low=0;
int high=array1.length-1;

mid =(low+high)/2;

while(low<=high) {
if(key>array1[mid]) {
 low=mid+1;
 mid=(low+high)/2;
}else if(key<array1[mid]) {
	high=mid-1;
	 mid=(low+high)/2;
}else if (key==array1[mid]) {
	break;
}
}
return mid;

}
}
