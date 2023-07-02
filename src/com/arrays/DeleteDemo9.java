package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteDemo9 {
	//9. Delete an element from array in java using Collections
	public static void main(String[] args) {
		
		String[] stringArray= {"Red","Green","Blue"};
		List<String> stringList =new ArrayList(Arrays.asList(stringArray));
		stringList.remove(2);
		stringList.remove("Green");
		System.out.println(stringList);
	}

}
