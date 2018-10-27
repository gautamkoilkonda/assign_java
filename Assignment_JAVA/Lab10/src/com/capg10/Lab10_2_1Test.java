package com.capg10;

import static org.junit.Assert.*;

import org.junit.Test;

public class Lab10_2_1Test {

	@Test
	public void testGetFirstname() {
		 Lab10_2_1 pl = new Lab10_2_1("Akhila","Shruthi",'F');
		 assertEquals(pl.getFirstname(),"Akhila");
	}

	@Test
	public void testGetLastname() {
		 Lab10_2_1 pl = new Lab10_2_1("Akhila","Shruthi",'F');
		 assertEquals(pl.getLastname(),"Shruthi");

	}

}
