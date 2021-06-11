package com.learning.java11.scjp.lambdas;
import java.util.ArrayList;
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> s_name= new ArrayList<String>();
		s_name.add("Thiyagarjan");
		s_name.add("Karthic");
		s_name.add("RajKumar");
		s_name.add("Parthiban");
		s_name.add("Sudha");
		System.out.println(s_name);
		s_name.add(0,"Amma");
		System.out.println(s_name);
		s_name.add("Arun");
		System.out.println(s_name);
		s_name.remove(4);
		System.out.println(s_name);
		for(String students: s_name) {
			System.out.println(students);
		}
		
		

	}

}
