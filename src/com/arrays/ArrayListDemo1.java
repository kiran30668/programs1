package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//1. 3 Different ways to convert arrays into ArrayList in Java
public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		String[] colors= {"Red","Green","Blue"};
		List<String> asList = Arrays.asList(colors);
		System.out.println(asList);
		
		//2.Way
		
		String[] s2= {"Red","Green","Blue"};
		List<String> l=new ArrayList<String>();
		Collections.addAll(l, s2);
		System.out.println(l);
		
		//3.way
		List<String> l3=new ArrayList<String>();
		for(String c:colors) {
			l3.add(c);
		}
		System.out.println(l3);
	}

}
