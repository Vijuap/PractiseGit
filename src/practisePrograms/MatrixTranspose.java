package practisePrograms;

import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("enter the no of rows: ");
		int r=input.nextInt();
		System.out.println("enter the no of columns: ");
		int c=input.nextInt();
		int [][] A=new int [r][c];
		int [][] B=new int [c][r];

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
		System.out.println("Transpose of Matrix is :");
		for (int i=0;i<c;i++) {
			for (int j=0;j<r;j++) {
				B[i][j]=A[j][i];
			}
		}
		for (int i=0;i<c;i++) {
			for (int j=0;j<r;j++) {
				System.out.print(B[i][j]+" ");
			}
			System.out.println(" ");
		}
		
	}
	
	

}
