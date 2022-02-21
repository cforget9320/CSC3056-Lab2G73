package org.jfree.data;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.*;

import junit.framework.TestCase;

public class RangeTest extends TestCase {
private Range rangeObjectUnderTest;
	@BeforeClass
	public void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	protected void setUp() throws Exception {
		rangeObjectUnderTest = new Range(-1,1);
	}
	

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testCentralValueShouldBeZero( ){
		assertEquals("The central value of -1 and 1 should be 0",0,rangeObjectUnderTest.getCentralValue(),0.000000001d);
	}

}
