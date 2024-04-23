package com.firstassignment;

import java.util.Scanner;

public class ArrayOperation {
	 private int arr[]=new int[5];
		
		public void declareArray() {
			Scanner in = new Scanner(System.in);
			for(int i=0;i<arr.length;i++) {
				arr[i]= in.nextInt();
			}		
		}
		
		public void printArray() {
			for(int i=0;i<arr.length;i++) {
				System.out.print(" "+arr[i]);
			}
		}

		public  int maxElement() {
			int max=arr[0];
			for(int i=0;i<arr.length;i++) {
				
				if(arr[i]>max) {
					max=arr[i];
				}
				}
				return max;
		}
		
		public int sumArray() {
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum=sum+arr[i];
			}
				return sum;
		}
		
		public int avgElement() {
			int sum=0;
			int avg;
			for(int i=0;i<arr.length;i++) {
				sum=sum+arr[i];
			}
			avg=sum/arr.length ;
			return avg;
		}
		
}
