import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RentalRecordTest {
	private RentalRecord rr;
    @Before
	public void init()
	{ 
		rr=new RentalRecord("34",new DateTime(02,02,2020),new DateTime(02,02,2020));
	}
  
    @Test
    public void testgetEstimatedReturnDate(){
    
    	try{
			DateTime myReturnedObject = rr.getEstimatedReturnDate();
	        assertNotNull(myReturnedObject);
	        assertTrue(myReturnedObject instanceof DateTime);
	    }catch(Exception e){
	        fail("got Exception, i want a DateTime object");
	     }
    }
    @Test
    public void testgetRentDate(){
    	try{
			DateTime myrentdate = rr.getRentDate();
	        assertNotNull(myrentdate);
	        assertTrue(myrentdate instanceof DateTime);
	    }catch(Exception e){
	        fail("got Exception, i want an object of DateTime");
	     }
    }
    	
    @Test
    public void testtostring1(){
    	
    	assertEquals("34:02/02/2020:02/02/2020:none:none:none",rr.toString());
    }
    @Test
    public void testtostring2(){
    	assertEquals("34:02/02/2020:02/02/2020:none:none:none",rr.toString());
    }
    @Test
    public void testgetDetails(){
    	assertEquals("Record ID:             34\n" + 
    			"Rent Date:             02/02/2020\n" + 
    			"Estimated Return Date: 02/02/2020",rr.getDetails());
    	
    	
    }
 



}
