package practisePrograms;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("enter the no of rows: ");
		int r=input.nextInt();
		System.out.println("enter the no of columns: ");
		int c=input.nextInt();
		int [][] A=new int [r][c];
		int [][] B=new int [c][r];
		int [][] C=new int [r][r];

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
		for (int i=0;i<c;i++) {
			for (int j=0;j<r;j++) {
				B[i][j]=input.nextInt();
			}
		}
		input.close();
		System.out.println("Matrix B is : ");
		for (int i=0;i<c;i++) {
			for (int j=0;j<r;j++) {
				System.out.print(B[i][j]+" ");
			}
			System.out.println(" ");
		}

		int sum=0;
		System.out.println("Multiplication of Matrix A and B is : ");
		
		for (int i=0;i<r;i++) {
			for (int j=0;j<r;j++) {
				
				for (int k=0;k<c;k++) {
					sum=sum+A[i][k]*B[k][j];
				}
			C[i][j]=sum;		
			sum=0;
			}
			
		}
		System.out.println("Matrix C is : ");
		for (int i=0;i<r;i++) {
			for (int j=0;j<r;j++) {
				System.out.print(C[i][j]+" ");
			}
			System.out.println(" ");
		}

	}

}
