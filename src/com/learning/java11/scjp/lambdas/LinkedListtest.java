package com.learning.java11.scjp.lambdas;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListtest {

	public static void main(String[] args) {
		LinkedList<String> food= new LinkedList<String>();
		LinkedList<String> fs= new LinkedList<String>();
		
		food.add("Briyani");
		food.add("Chicken Briyani");
		food.add("Chappathi");
		food.add("Panipoori");
		food.add("WhiteRice");
		
		fs=(LinkedList)food.clone();
		System.out.println(food.contains("Briyani"));
		food.containsAll(fs);
		
		System.out.println(fs.getClass());
		System.out.println(fs.hashCode());
		System.out.println(fs);
	
		
		fs.pollFirst();
		fs.pop();
	
		System.out.println(fs);
		
	}
}
