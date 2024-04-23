package com.matrixarray;

import java.util.Scanner;

public class ArrayOperation {

	//private int[][]arr1=new int[2][2];
	//private int[][]arr2=new int[2][2];

	
	public void declareArray(int arr[][]) {
		
		Scanner in= new Scanner(System.in);
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=in.nextInt();
			}
		}

	}
	public void printArray(int arr[][]) {
		for(int i=0;i<2;i++) {
			System.out.println();
			for(int j=0;j<2;j++) {
				System.out.print(" "+arr[i][j]);
			}
		}

		}
	
	public void addArray(int[][] arr1,int[][] arr2) {
		int[][] result=new int[2][2];
		for(int i=0;i<2;i++) {
			System.out.println();
			for(int j=0;j<2;j++) {
				result[i][j] = arr1[i][j]+arr2[i][j];
				System.out.print(" "+result[i][j]);
			}
		}
	}
	
	public void substractArray(int[][] arr1,int[][] arr2) {
		int[][] result=new int[2][2];
		for(int i=0;i<2;i++) {
			System.out.println();
			for(int j=0;j<2;j++) {
				result[i][j] = arr1[i][j]-arr2[i][j];
				System.out.print(" "+result[i][j]);
			}
		}
		
	}
	
	public void multliplyArray(int[][] arr1,int[][] arr2) {
		int[][] result=new int[2][2];
		for(int i=0;i<2;i++) {
			System.out.println();
			for(int j=0;j<2;j++) {
				result[i][j] = arr1[i][j]*arr2[i][j];
				System.out.print(" "+result[i][j]);
			}
		}
	
	}
	
	public void transpose(int[][] arr1,int[][] arr2) {
		for(int i=0;i<2;i++) {
			System.out.println();
			for(int j=0;j<2;j++) {
				arr2[i][j]=arr1[j][i];
				
			}
		}
	}
	
	public void scalarMultiArray(int[][] arr1,int a) {
		int[][] result=new int[2][2];
		System.out.println("Enter the scalar element: ");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		for(int i=0;i<2;i++) {
			System.out.println();
			for(int j=0;j<2;j++) {
				result[i][j] = arr1[i][j]* a;
				System.out.print(" "+result[i][j]);
			}
		}
	
	}
	}

