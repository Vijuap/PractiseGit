package practisePrograms;

import java.util.Scanner;

public class AddMatrix {

	public static void main(String[] args) {
		matrix();
	}
public static void matrix() {
	Scanner input =new Scanner(System.in);
	System.out.println("enter the no of rows: ");
	int r=input.nextInt();
	System.out.println("enter the no of columns: ");
	int c=input.nextInt();
	int [][] A=new int [r][c];
	int [][] B=new int [r][c];
	int [][] C=new int [r][c];

	System.out.println("Enter elements for matrix A:");
	for (int i=0;i<r;i++) {
		for (int j=0;j<c;j++) {
			A[i][j]=input.nextInt();
		}
	}
	System.out.println("Matrix A is : ");
	for (int i=0;i<r;i++) {
		for (int j=0;j<c;j++) {
			System.out.print(A[i][j]+" ");
		}
		System.out.println(" ");
	}
	System.out.println("Enter elements for matrix B:");
	for (int i=0;i<r;i++) {
		for (int j=0;j<c;j++) {
			B[i][j]=input.nextInt();
		}
	}
	input.close();
	System.out.println("Matrix B is : ");
	for (int i=0;i<r;i++) {
		for (int j=0;j<c;j++) {
			System.out.print(B[i][j]+" ");
		}
		System.out.println(" ");
	}

	System.out.println("Addition of Matrix A and Matrix B is Matrix C is  :" );
	
	for (int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			System.out.print(C[i][j]=A[i][j]+B[i][j]);
			System.out.print(" ");
 	
		}
		System.out.println(" ");
	}
	
	
}
}
