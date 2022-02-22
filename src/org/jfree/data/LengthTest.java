package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LengthTest extends Range {

	
	public LengthTest(double lower, double upper) {
		super(lower, upper);
		// TODO Auto-generated constructor stub
	}

	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetLength() {
		Range r1 = new Range(2,2);
		assertEquals("getLength did not return the expected output",0.0,r1.getLength());
		
		Range r2 = new Range(4, 9); 
	    assertEquals("getLength: Did not return the expected output", 5.0, r2.getLength()); 
	    
	    Range r3 = new Range(-99, -99); 
	    assertEquals("getLength: Did not return the expected output", 0.0, r3.getLength()); 
	    
	    Range r4 = new Range(-11, -4); 
	    assertEquals("getLength: Did not return the expected output", 7.0, r4.getLength()); 
	    
	    Range r5 = new Range(-5, 3); 
	    assertEquals("getLength: Did not return the expected output", 8.0, r5.getLength()); 

	}

}
