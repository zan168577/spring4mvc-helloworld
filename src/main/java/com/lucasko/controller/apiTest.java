package com.lucasko.controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class apiTest {
	
	public APIsController apii;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		apii=new APIsController();
	}

	@After
	public void tearDown() throws Exception {
		apii=null;
	}

	@Test
	public void test() {
//		System.out.println("---------------------------");
//		  System.out.println("test java.openyu.org");
//		  System.out.println("---------------------------");
//		fail("Not yet implemented");
		String input="5";
		String output="5";
		assertEquals(output, apii.count2(input));
	}

}
