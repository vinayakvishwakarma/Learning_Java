package com.matrixarray;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][]arr1=new int[2][2];
		 int[][]arr2=new int[2][2];
		 int[][]trans=new int[2][2];
		 int a = 0;
		// int[][] sum;
		// int[][] diff;
		// int[][] product;

		System.out.println("Enter the 1st Array elements:");
		ArrayOperation obj1 = new ArrayOperation();
		obj1.declareArray(arr1);
		System.out.println("Display 1st Array: ");
		obj1.printArray(arr1);
		System.out.println();
		System.out.println("Enter the 2st Array elements:");
		obj1.declareArray(arr2);
		System.out.println("Display 2st Array: ");
		obj1.printArray(arr2);
		
		//ADD
		
		System.out.println();
		//sum=obj1.addArray(arr1, arr2);
		System.out.println("Sum of array: ");
		obj1.addArray(arr1, arr2);
		
		//SUBSTRACT
		
		System.out.println();
		//diff=obj1.substractArray(arr1, arr2);
		System.out.println("Difference of array: ");
		obj1.substractArray(arr1, arr2);
		
		//MULTIPLY
		
		System.out.println();
		//product=obj1.multliplyArray(arr1, arr2);
		System.out.println("Product of array: ");
		obj1.multliplyArray(arr1, arr2);
		
		//TRANSPOSE
		
		System.out.println();
		obj1.transpose(arr1, trans);
		System.out.println("Transpose of array: ");
		obj1.printArray(trans);
		
		//SCALAR MULTIPLICATION
		
		System.out.println();
		obj1.scalarMultiArray(arr1, a);
		

		
		
		
				
	}

}
