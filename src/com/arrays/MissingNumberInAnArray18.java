package com.arrays;

public class MissingNumberInAnArray18 {
	//18.Missing Number In An Array
	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6,7,8,10,11};
		int actualSum=0;
		int expectedSum=((array.length+1)*(array.length+2)/2);
		
		for(int i:array) {
			actualSum=actualSum+i;
		}
		System.out.println(actualSum);
		System.out.println(expectedSum-actualSum);
	}

}
