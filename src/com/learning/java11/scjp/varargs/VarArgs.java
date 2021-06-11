package com.learning.java11.scjp.varargs;

public class VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sub());
		sub(2,new int[] {4,6,8,10});		

	}
	public static int sub() {
		return 1;
		
	}
	public static void sub(int a, int...b) {
		int result=0;
		for(int q: b)
			result = result+q;
		System.out.println(result);
	}
}
