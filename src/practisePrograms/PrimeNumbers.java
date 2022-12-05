package practisePrograms;

import java.util.Scanner;

public class PrimeNumbers 	{
	 public static void main(String args[])
	 {
	 int n ,count ;
	 try (Scanner in = new Scanner(System.in)) {
		System.out.println("Enter the number of prime numbers you want");
		 n = in.nextInt();
	}
	 if (n >= 1)
	 {
	 System.out.println("First "+n+" prime numbers are :-");
	 }
	 for (int i=2;i<=n;i++) {
		 count =0;
		 for (int j=2;j<i;j++) {
			 if (i%j==0) {
				 count++;
			 }
		 }
		 if (count==0) {
			 System.out.println(i);
	 }
	 }
	 }
	}
		
