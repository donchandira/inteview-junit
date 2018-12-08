package com.chandira.demo;

public class BinaryAdd2 {

	public static void main(String[] args) {
		
		String a = "1010";
		String b = "1011";
		
		 // carry = 0, 1
        int carry = 0;
        
        // variables to store the length of the strings
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        
        String result = "0";
        
        while(aLen >= 0 || bLen >= 0 || carry == 1)
        {
            
            carry += (aLen>=0)? Character.getNumericValue( a.charAt(aLen) ) : 0;
            carry += (bLen>=0)? Character.getNumericValue( b.charAt(bLen) ) : 0;
            
            // 0 , 1 , 2 , 3            
            result = (carry % 2) + result;
            
            carry = (carry > 2)? 1: 0;
            
            aLen--; bLen--;
            
        }
        
        System.out.println( result );

	}

}
