import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DateTimeTest {

	private DateTime dat1;
	private DateTime dat2;
	private DateTime dat3;
	private DateTime dat4;
	
	@Before
	public void init()
	{ 
		dat1=new DateTime();
		dat2=new DateTime(4);
		dat3=new DateTime(new DateTime(02,02,2020),3);
		dat4=new DateTime(4,3,2019);
	}
	@Test
	public void testgetNameOfDay() {
		assertEquals("Saturday",dat1.getNameOfDay());
	}
	@Test
	public void testgetEightDigitDate() {
		assertEquals("29022020",dat1.getEightDigitDate());
	}
	@Test
	public void testgetCurrentTime() {
		assertEquals("2020-02-29",dat1.getCurrentTime());
	}
	@Test
	public void testgetFormattedDate() {
		assertEquals("29/02/2020",dat1.getFormattedDate());
	}
	@Test
	public void testdiffDays() {
		assertEquals(0,dat1.diffDays(new DateTime(4,3,2019), new DateTime(4,3,2019)));
	}
	@Test
	public void testtoString() {
		assertEquals("29/02/2020",dat1.toString());
	}

}
