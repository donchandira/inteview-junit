package com.chandira.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class InterviewTest {

	Interview interview = new Interview();
	
	@Test
	public void test() {
		// "String"
		// Expected value = "gnirtS"
		
		//added
		assertEquals("gnirtS", interview.reverseString("String"));
	}
	
	@Test
	public void test1()
	{
		assertEquals("gnirtS", interview.reverseString1("String"));
	}

}
