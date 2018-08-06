package com.stackroute.pe2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PE2Test {
	private static PE2Exercise obj;
	
	@BeforeClass
	public static void setup() {
		obj = new PE2Exercise();
	}
	
	@AfterClass
	public static void teardown() {
		obj = null;
	}
	
	@Test
	public void isPalindromeTest() {

		assertEquals(true,obj.isPallindrome("abababa"));
		
		assertNotEquals(false,obj.isPallindrome("aba"));
		
		assertEquals(false,obj.isPallindrome("abc"));
		
	}

	@Test
	public void isPow4Test() {

		assertEquals(true,obj.isPow4(16));
		
		assertEquals(false,obj.isPow4(81));
		
		assertNotEquals(true,obj.isPow4(10));
		
	}

	@Test
	public void getMemVarTest() {

		assertArrayEquals(new Object[] {"Harry Potter", 30 ,2500.3}, obj.ob.getMemberVariable("Harry Potter", 30 ,2500.3));
	    
		assertNotNull(obj.ob.getMemberVariable("Harry Potter", 30 ,2500.3));

		assertNull(null, obj.ob.getMemberVariable(null, 0, 0));
	}
	
	@Test
	public void isEvenTest() {
		assertEquals(true, obj.isEven(98));
		assertEquals(false, obj.isEven(99));
		assertEquals(false, obj.isEven(101));
	}
	
	@Test
	public void isEvenFailure() {
		assertNotEquals(false, obj.isEven(98));
		assertNotEquals(true, obj.isEven(99));
		assertNotEquals(true, obj.isEven(101));
	}
	
	@Test
	public void studentTest() {
		assertArrayEquals(new double[] {81.50, 65, 98}, obj.stgrad(4,new int[]{86, 65, 98, 77}), 0);
	}
	
	@Test
	public void studentFailure() {
		assertNotEquals(new double[] {81, 65, 98}, obj.stgrad(4,new int[]{86, 65, 98, 77}));
	}
	
	@Test
	public void factTest() {
		assertEquals(3628800, obj.longFactorial(10));
		assertEquals(1, obj.longFactorial(1));
		assertEquals(120, obj.longFactorial(5));
	}
	
	@Test
	public void factFailure() {
		assertNotEquals(62270208, obj.longFactorial(1));
		assertNotEquals(62270208, obj.longFactorial(13));
		assertNotEquals(62270208, obj.longFactorial(13));
	}
	
}
