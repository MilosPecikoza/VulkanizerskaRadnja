package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AutoGumaTest {
	
	AutoGuma a;
	
	@Before
	public void setUp() throws Exception {
		a = new AutoGuma();
	}
	
	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test
	public void testSetMarkaModel() {
		a.setMarkaModel("Michelin");
		
		assertEquals(a.getMarkaModel(), "Michelin");
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		a.setMarkaModel(null);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelPrazan() {
		a.setMarkaModel("");
	}

	@Test
	public void testSetPrecnik() {
		a.setPrecnik(15);
		
		assertEquals(a.getPrecnik(), 15);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikManji() {
		a.setPrecnik(5);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVeci() {
		a.setPrecnik(25);
	}
	
	@Test
	public void testSetSirina() {
		a.setSirina(200);
		
		assertEquals(a.getSirina(), 200);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaVeca() {
		a.setSirina(800);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaManja() {
		a.setSirina(10);
	}

	@Test
	public void testSetVisina() {
		a.setVisina(50);
		
		assertEquals(a.getVisina(), 50);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaManja() {
		a.setVisina(5);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaVecaa() {
		a.setVisina(100);
	}
	
	@Test
	public void testToString() {
		a.setMarkaModel("Michelin");
		a.setPrecnik(15);
		a.setSirina(200);
		a.setVisina(50);
		
		assertEquals(a.toString(), "AutoGuma [markaModel=Michelin, precnik=15, sirina=200, visina=50]");
	}

	
	@Test
	public void testEqualsObjectTrue() {
		a.setMarkaModel("Michelin");
		a.setPrecnik(15);
		a.setSirina(200);
		a.setVisina(50);
		
		AutoGuma b = new AutoGuma();
		b.setMarkaModel("Michelin");
		b.setPrecnik(15);
		b.setSirina(200);
		b.setVisina(50);
		
		assertTrue(a.equals(b));
	}
	
	@Test
	public void testEqualsObjectFalse() {
		a.setMarkaModel("Michelin");
		a.setPrecnik(15);
		a.setSirina(200);
		a.setVisina(50);
		
		AutoGuma b = new AutoGuma();
		b.setMarkaModel("Melin");
		b.setPrecnik(16);
		b.setSirina(200);
		b.setVisina(50);
		
		assertFalse(a.equals(b));
	}
}
