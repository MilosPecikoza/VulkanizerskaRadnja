package gume.radnja;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;

public class VulkanizerskaRadnjaTest {

	VulkanizerskaRadnja v;
	AutoGuma a;
	AutoGuma b;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		v = new VulkanizerskaRadnja();
		a = new AutoGuma();
		b = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		v = null;
		a = null;
		b = null;
	}

	@Test (expected = java.lang.NullPointerException.class)
	public void testdodajGumuNull() {
		v.dodajGumu(null);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testdodajGumuVecPostoji() {
		b.setMarkaModel("Tigar");
		b.setPrecnik(20);
		b.setSirina(150);
		b.setVisina(80);
		
		a.setMarkaModel("Tigar");
		a.setPrecnik(20);
		a.setSirina(150);
		a.setVisina(80);
		
		v.dodajGumu(a);
		v.dodajGumu(b);
	}
	
	@Test 
	public void testdodajGumu() {
		a.setMarkaModel("Tigar");
		a.setPrecnik(20);
		a.setSirina(150);
		a.setVisina(80);
		
		v.dodajGumu(a);
		
		assertEquals(v.gume.getFirst(), a);
	}
	
	@Test
	public void testpronadjiGumuNull() {
		assertEquals(v.pronadjiGumu(null), null );
	}
	
	@Test
	public void testpronadjiGumuNemaUList() {
		a.setPrecnik(15);
		a.setSirina(200);
		a.setVisina(80);
		
		v.gume.add(b);
		b.setPrecnik(20);
		b.setSirina(250);
		b.setVisina(70);
		
		a.setMarkaModel("Michelin");
		b.setMarkaModel("Sava");
		
		v.gume.add(a);
		v.gume.add(b);
		assertEquals(v.pronadjiGumu("Tigar").size(), 0);
	}
	
	@Test
	public void testpronadjiGumu1() {
		a.setMarkaModel("Michelin");
		b.setMarkaModel("Sava");
		v.gume.add(a);
		v.gume.add(b);
		assertEquals(v.pronadjiGumu("Sava").get(0), b);
	}
	
	@Test
	public void testpronadjiGumu2() {
		a.setMarkaModel("Tigar");
		a.setPrecnik(15);
		a.setSirina(200);
		a.setVisina(80);
		
		b.setMarkaModel("Tigar");
		b.setPrecnik(20);
		b.setSirina(250);
		b.setVisina(70);
		
		v.gume.add(a);
		v.gume.add(b);
		
		assertTrue(v.pronadjiGumu("Tigar").get(0).equals(a) && v.pronadjiGumu("Tigar").get(1).equals(b));
		
	}
}
