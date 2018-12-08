package com.chandira.challenge;

public class ChallengesReverse {

	public static void main(String[] args) {
		String name = "Chandira";
		
		byte[] nameByte = name.getBytes();
		byte[] tempByte = new byte[name.length()];
		
		System.out.println(nameByte);
		System.out.println(nameByte.length);
		
		for(int i = 0; i < nameByte.length; i++)
		{
			tempByte[i] = nameByte[(nameByte.length - i) - 1];
		}
	
		System.out.println(new String(tempByte));

	}

}
