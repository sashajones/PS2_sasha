package pkgTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import PkgEmpty.MyInteger;

// Command Shift O

public class TestPS2 {
	
	public static MyInteger intA;
	public static MyInteger intB;
	public static MyInteger intC;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		intA = new MyInteger(12);
		intB = new MyInteger(21);
		intC = new MyInteger(13);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	
	@Test
	public void TestisEvenInstance() {
		assertTrue("12 is an even number", intA.isEven());
		
		assertFalse("21 is not an even number", intB.isEven());

	}
	
	@Test
	public void TestisEvenStatic() {
		assertTrue("12 is an even number", MyInteger.isEven(12));
		
		assertFalse("13 is not an even number", MyInteger.isEven(13));

	}
	
	@Test
	public void TestisEvenClass() {
		assertTrue("12 is an even number", MyInteger.isEven(intA));
		
		assertFalse("21 is not an even number", MyInteger.isEven(intB));

	}

	
// Testing isOdd
	@Test
	public void TestisOddInstance() {
		assertTrue("21 is an odd number", intB.isOdd());
		
		assertFalse("12 is not an odd number", intA.isOdd());

	}
	
	@Test
	public void TestisOddStatic() {
		assertTrue("21 is an odd number", MyInteger.isOdd(21));
		
		assertFalse("4 is not an odd number", MyInteger.isOdd(4));

	}
	
	@Test
	public void TestisOddClass() {
		assertTrue("21 is an odd number", MyInteger.isOdd(intB));
		
		assertFalse("4 is not an odd number", MyInteger.isOdd(intA));

	}
	

	@Test
	public void TestisPrimeInstance() {
		assertTrue("13 is a prime number", intC.isPrime());
		
		assertFalse("12 is not a prime number", intA.isPrime());

	}
	
	@Test
	public void TestisPrimeStatic() {
		assertTrue("13 is a prime number", MyInteger.isPrime(13));
		
		assertFalse("42 is not a prime number", MyInteger.isPrime(42));
				
	}
	
	@Test
	public void TestisPrimeClass() {
		assertTrue("13 is a prime number", MyInteger.isPrime(intC));
		
		assertFalse("21 is not a prime number", MyInteger.isPrime(intB));

	}
	
	@Test
	public void TestequalsClass() {
		assertTrue("12 is equal to 12", intA.equals(12));
		
		assertFalse("21 is not a prime number", intA.equals(intB));

	}
}
