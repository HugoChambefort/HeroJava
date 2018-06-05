package jpu2016.hit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HitTest {

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
	public void testGetStrength() {
		final int expected = 1;
		 final Hit hit = new Hit(1, 10, TypeHit.NORMAL);
		 assertEquals(expected, hit.getStrength()); 

	}

	@Test
	public void testGetRange() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetTypeHit() {
		fail("Not yet implemented"); // TODO
	}

}
