package com.stackroute.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddvaluesTest {

	@Test
	public void test() {
		Addvalues av=new Addvalues();
		int result=av.calVal();
		assertEquals(18,result);
	}

}
