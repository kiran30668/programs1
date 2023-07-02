package com.arrays;

import java.util.Scanner;

public class MaxAndMinInArray25 {
	//25.Find Maximum and Minimum elements in an array
	public static void main(String[] args) {
		int min,max;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element in an array");
		int nextInt = sc.nextInt();
		int[] a=new int[nextInt];
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		max=a[0];
		min=a[0];
		//maxlogic
		for(int i=0;i<nextInt;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		
		for(int i=0;i<nextInt;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		
		System.out.println(max+" "+min);
	}

}
