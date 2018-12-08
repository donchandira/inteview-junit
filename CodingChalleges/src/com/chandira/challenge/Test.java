package com.chandira.challenge;

import java.util.regex.Matcher;

public class Test {

	public static void main(String[] args) {
		String str = "jkda";
		System.out.println(str.matches("[^a-d^f-z]+"));
		
		
		MyImplement myImp = new MyImplement();
		System.out.println(myImp.i);
		myImp.myPrint();
		myImp.mySout();
	}

}
