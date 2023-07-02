package com.arrays;

public class IndexDemo23 {
	//23.Find Index of element in an Array
	public static void main(String[] args) {
		String[] colors= {"Red","Green","Blue","Orange"};
		int index=0;
		for(int i=0;i<colors.length;i++) {
			if(colors[i]=="Orange") {
				index=i;
			}
		}
		System.out.println(index);
	}

}
