package com.chandira.demo;

import java.util.LinkedList;

public class BinaryAdd {

	public static void main(String[] args) {

		String strA = "1010";
		String strB = "1011";


		int carry = 0;
		LinkedList<Integer> result = new LinkedList<>();

		int i = strA.length() - 1;
		int j = strB.length() - 1;

		while(i >= 0 || j >= 0 || carry == 1)
		{

			carry+=( (i>=0)? Character.getNumericValue(strA.charAt(i)): 0 );
			carry+=( (j>=0)? Character.getNumericValue(strB.charAt(j)): 0 );			
			result.addFirst(carry%2);
			carry = carry/2;
			
			i--; j--;
		}
		
		System.out.println(result);
		
	}

}
