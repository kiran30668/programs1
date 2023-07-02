package com.arrays;

public class CreateArrays3 {
	
	//3.How to create arrays and add elements in an array
	//Array is an element that holds data of similar data tuype
	// double[] data=new Double[10];
	public static void main(String[] args) {
		
		int[] numbers=new int[5];
		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		numbers[3]=40;
		numbers[4]=50;
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		//System.out.println(numbers[3]);
	}

}
