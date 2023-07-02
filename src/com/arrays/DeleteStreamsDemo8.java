package com.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DeleteStreamsDemo8 {
	//8.How to delete an element from array in java using Java8 Streams
	//1.create an array and initialize array with integer elements
	//2.decide the index
	//3.Convert this array into IntStream using IntStream.range() method
	//4.From a new array by filtering the elements which are not equal to index
	//5.Print the Array
	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5};
		System.out.println("Original Array=" + Arrays.toString(numbers));
		int index=3;
		int[] array = IntStream.range(0, numbers.length).filter(i->i!=index).map(i->numbers[i]).toArray();
		
		System.out.println(Arrays.toString(array));
	}

}
 