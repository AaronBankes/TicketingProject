package athleticComplex;

import org.junit.Test;
import static org.junit.Assert.*;

public class functiontester 
{
	@Test
	public void test()
	{
		Person testPerson1 = new Person("Tester", 0, false);
		Person testPerson2 = new Person("Tester", 9, true);
		Person testPerson3 = new Person("Tester", 10, false);
		Person testPerson4 = new Person("Tester", 15, true);
		Person testPerson5 = new Person("Tester", 10, false);
		Person testPerson6 = new Person("Tester", -4, false);
		Person testPerson7 = new Person("Tester", -4, true);
		assertEquals("No balance, no credit", false, testPerson1.hasCredit(10));
		assertEquals("No balance, has credit", true, testPerson2.hasCredit(10));
		assertEquals("Has balance, no credit", true, testPerson3.hasCredit(10));
		assertEquals("Has balance, has credit", true, testPerson4.hasCredit(10));
		assertEquals("Exact balance, no credit", true, testPerson5.hasCredit(10));
		assertEquals("Negative balance, no credit", false, testPerson6.hasCredit(10));
		assertEquals("Negative balance, has credit", true, testPerson7.hasCredit(10));
	}
}
