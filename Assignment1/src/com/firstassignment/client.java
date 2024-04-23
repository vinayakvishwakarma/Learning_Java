package com.firstassignment;

import java.util.Scanner;

public class client {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	System.out.println("Enter the array: ");
	ArrayOperation obj1=new ArrayOperation();
	obj1.declareArray();
	System.out.println("Display Array:");
	obj1.printArray();
	System.out.println("\n");
	
	//a. Implement a method to find the maximum element in an array.
	
	int ans=obj1.maxElement();
	System.out.println("Max Element: "+ans);
	System.out.println("\n");
	
	//b. Implement a method to calculate the sum of all elements in an array.
	
	int ans2=obj1.sumArray();
	System.out.println("Sum of array: "+ans2);
	System.out.println("\n");
	
	//c. Implement a method to calculate the average of all elements in an array.
	
	int ans3=obj1.avgElement();
	System.out.println("Average of Elements: "+ans3);
	
	//d. Implement a method to sort the elements of an array in ascending order using any
	//   sorting algorithm of your choice.
	
	
	
	}

}



