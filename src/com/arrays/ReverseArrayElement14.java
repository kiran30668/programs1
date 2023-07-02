package com.arrays;

import java.util.Scanner;

public class ReverseArrayElement14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements into array");
		int num = sc.nextInt();
		
		int[] a=new int[num];
		
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Printing the reverse elements in an Array");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}

}
