package com.chandira.demo;

public class Interview {

	public String reverseString(String str) {
		// [S,t,r,i,n,g]
		// 0 - (length - 1)
		// [g,n,i,r,t,S]

		// assign the characters to the array
		byte[] temp = str.getBytes();
		byte[] reversedString = new byte[str.length()];
		
		for(int i=0; i<str.length(); i++)
		{
			reversedString[i] = temp[(str.length()-i) - 1];
		}
		System.out.println(new String(reversedString));
		return new String(reversedString);
	}
	
	public String reverseString1(String str)
	{
		System.out.println("Test");
		int right = str.length()-1;
		String temp = null;
		
		for(int left = 0; left<right; left++, right--)
		{
			 temp = str.substring(right, right + 1);
			 
			 System.out.println(temp);
		}
		
		return str;
		
	}

}
