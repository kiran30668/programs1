package com.arrays;

import java.util.Arrays;

public class Different5WaysToPrintElementsInArray4 {
	//How to print elements in an array in Java?
	//5 Different ways to print elements in Java
	public static void main(String[] args) {
		
		//1.Traditional way before 1.5 using for loop
		String[] str= {"Red","Green","Blue"};
		//System.out.println(str);
		System.out.println("===========Using clasic For loop:================");
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		
		//2.Enhanced For loop
		System.out.println("========Using Enhanced========");
		for(String s1:str) {
			System.out.println(s1);
		}
		
		//3.Using Arrays.asList() method
		Integer[] intArray= {1,2,3}; //not work for primitives work for objects change int->Integer
		System.out.println("===========Using Arrays.asList() method=========");
		System.out.println(Arrays.asList(str));
		System.out.println(Arrays.asList(intArray));
		
		//4.Using Arrays.toString() and Arrays.deeptoString()
		System.out.println("==========Using Arrays.toString() and Arrays.deeptoString()===============");
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(intArray));
		System.out.println("========Deep toString() method==========");
		int[] [] twod=new int[][] {{1,2,3},{4,5,6}};
		System.out.println(Arrays.deepToString(twod));
		
		
		//5.Using Streams
		System.out.println("========Using Stream API=========");
		Arrays.asList(str).stream().forEach(s->System.out.println(s));
		System.out.println("---------------------");
		Arrays.asList(str).stream().forEach(System.out::println);
		
	}

}
