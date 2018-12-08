package com.chandira.challenge;

public class ChallengeReverse1 {

	public static void main(String[] args) {

		String challenge = "Chandira";
		char[] reverseCharTemp = challenge.toCharArray();

		int left, right = 0;
		right = reverseCharTemp.length - 1;

		for (left = 0; left < right; left++, right--) {
			char temp = reverseCharTemp[left];
			reverseCharTemp[left] = reverseCharTemp[right];
			reverseCharTemp[right] = temp;
		}
		
		for(char c: reverseCharTemp)
			System.out.print(c);

	}

}
