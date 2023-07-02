package com.arrays;

import java.util.Scanner;

public class ArrayDemoByTakingInput5 {
	
	//Write a java program to create an array by taking input
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		
		int[] array=new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the elements");
			array[i]=sc.nextInt();
		}
		sc.close();
		
		System.out.println("Printing the elements in an array");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);	
		}
	}

}
