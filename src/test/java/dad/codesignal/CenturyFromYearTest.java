package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CenturyFromYearTest {
private TheJourneyBegins tjb;
	
	@Before
	public void setup() {
		tjb = new TheJourneyBegins();
	}
	
	@Test
	public void test1() {
		assertEquals(20, tjb.centuryFromYear(1905));
	}
	
	@Test
	public void test2() {
		assertEquals(17, tjb.centuryFromYear(1700));
	}
	
	@Test
	public void test3() {
		assertEquals(1, tjb.centuryFromYear(8));
	}
	
	@Test
	public void test4() {
		assertEquals(4, tjb.centuryFromYear(375));
	}
}
