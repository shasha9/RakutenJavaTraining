package com.rakuten.training.collections;

import java.util.Arrays;



public class SortDemo {
	
	public static String[] strings = {"this","is","a","bunch","of","strange","words","like","xylophone","and","zoo"};
	

	public static void main(String[] args) {
		//simpleStringArraySort();
		simpleStringListSort();

	}


	private static void simpleStringListSort() {
		// TODO Auto-generated method stub
		
	}


	private static void simpleStringArraySort() {
		System.out.println("before sort\n"+Arrays.asList(strings));
		Arrays.sort(strings);
		System.out.println("after sort\n"+Arrays.asList(strings));
		
	}

}

