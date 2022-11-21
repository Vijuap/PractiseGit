package practisePrograms;
import java.util.Scanner;

public class Vowels2Index {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
	sc.close();
		System.out.println(vowelToIndex(s));

	}
public static String vowelToIndex(String str) {
	str.toLowerCase();
	char[] ch=str.toCharArray();
	for (int i=0;i<ch.length;i++) {
		char ch1=str.charAt(i);
	
		if (ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u') {
			String front = str.substring(0, i);
			String back = str.substring(i + 1);
			str = front + i + back;
		}
	}
	String str1=new String(str);
   return str1;
}
}
