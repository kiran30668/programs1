package com.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDuplicatesDemo20 {
	//check Array contains Duplicates or Not
	public static void main(String[] args) {
		
		String[] duplicates= {"java","oracle","c","java"};
		
		List<String> duplicatesList = Arrays.asList(duplicates);
		Set duplicatesSet=new HashSet<>();
		
		if(duplicatesList.size()!=duplicatesSet.size()) {
			System.out.println("The array contains duplicates");
		}else {
			System.out.println("The array doesn't contains duplicates");
		}
	}

}
