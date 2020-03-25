package com.epam.TddJunit;

import static org.junit.Assert.*;
import org.junit.Test;

public class RemoveTestA {

	/*
	 *  “ABCD” => “BCD” 
     *  “AACD” => “CD”  
     *  “BACD” => “BCD” 
     *  “BBAA” => “BBAA”        
     *  “AABAA” => “BAA” 
	 */
	@Test
	public void test1st() {
		assertEquals("BCD",RemoveA.remove("ABCD"));
	}
	@Test
	public void testFirst2() {
		assertEquals("CD",RemoveA.remove("AACD"));
	}
	@Test
	public void test2nd() {
		assertEquals("BCD",RemoveA.remove("BACD"));
	}
	@Test
	public void testLast() {
		assertEquals("BBAA",RemoveA.remove("BBAA"));
	}
	@Test
	public void testRandom() {
		assertEquals("BAA",RemoveA.remove("AABAA"));
	}
	@Test
	public void testEmpty() {
		assertEquals("",RemoveA.remove(""));
	}

}
