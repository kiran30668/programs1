package com.arrays;

import java.util.Scanner;

public class MaxDifferenceArray26 {
	//26. Max difference between elements in array
	public static void main(String[] args) {
		int n, max,min;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements: ");
		 n= sc.nextInt();
		 int[] a=new int[n];
		 System.out.println("Enter the elements of array");
		 for(int i=0;i<n;i++) {
			 a[i]=sc.nextInt();
		 }
		 
		 max=a[0]; min=a[0];
		 
		 for(int i=0;i<n;i++) {
			 if(a[i]>max) {
				 max=a[i];
			 }
		 }
		 
		 for(int i=0;i<n;i++) {
			 if(a[i]<min) {
				 min=a[i];
			 }
		 }
		 
		 System.out.println("Max Difference: "+(max-min));
	}

}
