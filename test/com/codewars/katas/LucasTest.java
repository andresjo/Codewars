package com.codewars.katas;

import com.codewars.katas.Lucas;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LucasTest{
	
	  @Test
	  public void testLucasnum() throws Exception{
	    assertEquals(2, Lucas.lucasnum(0));
	    assertEquals(1, Lucas.lucasnum(1));
	    assertEquals(-11, Lucas.lucasnum(-5));
	    assertEquals(123, Lucas.lucasnum(-10));
	  }
  
}