package com.arrays;

import java.util.Scanner;

public class SumArrayDemo13 {
	//Sum of array in ajava
	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n = sc.nextInt();
		
		int[] array=new int[n];
		
		System.out.println("Enter the elements in an Array:");
		
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
		for(int i:array) {
			sum=sum+i;
		}
		
		System.out.println(sum);
	}

}
