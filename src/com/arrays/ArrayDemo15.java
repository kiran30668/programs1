package com.arrays;

import java.util.Arrays;

public class ArrayDemo15 {
	//15.Java Program to create end initialize an array
	public static void main(String[] args) {
		Integer[] i=new Integer[4];
		i[0]=11;
		i[1]=12;
		i[2]=13;
		i[3]=14;
		System.out.println(i.length);
		System.out.println(Arrays.asList(i));
		
		for(Integer num:i) {
			System.out.println(num);
		}
	}

}
