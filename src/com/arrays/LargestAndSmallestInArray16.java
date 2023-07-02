package com.arrays;

public class LargestAndSmallestInArray16 {
	//16.Largest and Smallest in an Array
	public static void main(String[] args) {
		int[] intArray= {1,100,20,30,50};
		
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		
		for(int number:intArray) {
			
			if(number>largest) {
				largest=number;
			}else if (number<smallest) {
				smallest=number;
			}
		}
		
		
		System.out.println(largest);
		System.out.println(smallest);
	}

}
