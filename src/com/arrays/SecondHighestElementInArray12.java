package com.arrays;

import java.util.Arrays;

public class SecondHighestElementInArray12 {
	//12.Find second largest element in an Array
	public static void main(String[] args) {
		
		int[] array= {1,20,5,6,16,10};
		Arrays.sort(array);
		
		System.out.println(array[array.length-2]);
	}

}
