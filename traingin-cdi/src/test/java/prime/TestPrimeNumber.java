package prime;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import traiing.cdi.Printer;

class TestPrimeNumber {

	//@Test
	//void test() {
		//fail("Not yet implemented");
	//}
	@Test
	public void primeNotNull () {
		Printer p = new Printer();
		assertNotNull("We can create the bean " + p);
	}
	
	// test case 2
	//@Test
	//public void isPrime() {
		//Printer p = new Printer();
		//p.setName(5);
		//assertEquals("PRIME", p.getSalutation());
	//}

}
