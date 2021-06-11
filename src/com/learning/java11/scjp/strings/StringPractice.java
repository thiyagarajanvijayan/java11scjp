package com.learning.java11.scjp.strings;

public class StringPractice {

	public static void main(String[] args) {

		String name="Thiyagarajan";
		String nickName="Thiyagarajan";
		String sname= new String("Thiyagarajan");
		System.out.println(name);
			if (name==nickName) {
			System.out.println("Both String are same name==nickName");
			}
			if (name==sname) {
			System.out.println("Both  String are same name==sname");
			}
			else {
				
				if(name.equals(sname)) {
					System.out.println("Both String are Same name.equalssname");
				
				}
				
			}
		}
		
				
	}

