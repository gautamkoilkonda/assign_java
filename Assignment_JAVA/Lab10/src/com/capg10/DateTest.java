package com.capg10;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateTest {

	@Test
	public void testGetDay() {
		Date date = new Date(28,10,1996);
		assertEquals(date.getDay(),28);
	}

	@Test
	public void testGetMonth() {
		Date date = new Date(28,10,1996);
		assertEquals(date.getMonth(),10);
	}

	@Test
	public void testGetYear() {
		Date date = new Date(28,10,1996);
		assertEquals(date.getYear(),1996);
	}

}
