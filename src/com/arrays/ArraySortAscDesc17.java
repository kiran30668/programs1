package com.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortAscDesc17 {
	//Arrays Ascending and Descending
	public static void main(String[] args) {
		 String[] str= {"one","two","three","four"};
		 
		 System.out.println("Before Sorting");
		 for(String string:str) {
			 System.out.println(string);
		 }
		 
		 Arrays.sort(str);
		 
		 System.out.println("Ascending Sorting");
		 for(String string:str) {
			 System.out.println(string);
		 }
		 
		 Arrays.sort(str, Collections.reverseOrder());
		 System.out.println("Descending Order");
		 for(String string:str) {
			 System.out.println(string);
		 }
	}

}
