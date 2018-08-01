package com.stackroute.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CharcheckTest {

	@Test
	public void test() {
		Charcheck cc=new Charcheck();
		String result=cc.checkCha(5);
		assertEquals("Number",result);
		
	}

}
