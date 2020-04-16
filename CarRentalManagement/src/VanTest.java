 import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VanTest {
	private VehicleType van;
	private VehicleType car;
	private RentalRecord records[];
	private Vehicle vc;
	private Van v;
	private Van v1;
	private Van v2;
	private Van c;
	private Van c1;

@Before	
	public void init()
	{
	
		v=new Van("V_1", 20, "L", "1111", 1, van);
		v1=new Van("V_1", 20, "L", "1111", 0, van);
		v2=new Van("V_1", 20, "L", "1111", 2, van);
		c=new Van("C_1", 20, "L", "1111", 1, car);
		c=new Van("C_1", 20, "L", "1111", 1, car);
		c1=new Van("C_1", 20, "L", "1111", 0, car);
		car=new VehicleType(4);
		van= new VehicleType(15,new DateTime(02,02,2020));
		vc=new Vehicle("C_1", 20, "L", "1111", 1, car);
		//records[0]=new RentalRecord("34", new DateTime(02,02,2020), new DateTime(02,02,2020));
	//	records[1]=new RentalRecord("35", new DateTime(02,02,2020), new DateTime(05,02,2020));
	}
	
	@Test
	public void testgetLateFeeif()
	{
		assertEquals(598.0, v.getLateFee(new DateTime(04,02,2020), new DateTime(02,02,2020)),0.0);
		}
	@Test
	public void testgetLateFeeelse()
	{
		assertEquals(0.0, v.getLateFee(new DateTime(02,02,2020), new DateTime(02,02,2020)),0.0);
	}
	@Test	
	public void testreturnVehiclecar()
	{	
		Van c=new Van("C_1", 20," L"," 1111", 1, car);
		//dont get the record
		//assertEquals(false,c.returnVehicle(new DateTime(12,02,2020)));
	}
	/*
	@Test	
	public void testreturnVehicle1()
	{	
		assertEquals("van",v.returnVehicle(new DateTime(02,02,2019)));
	}*/
	//43/56
	@Test	
	public void testreturnVehiclevan()
	{	
		assertEquals(false,v1.returnVehicle(new DateTime(02,02,2020)));
		
	}
	@Test	
	public void testreturnVehiclevan1()
	{	
		assertEquals(false,v1.returnVehicle(new DateTime(27,02,2020)));
	}
	@Test
	public void testreturnVehiclevanif()
	{	
		assertEquals(false,v1.returnVehicle(new DateTime(02,02,2020)));
		
	}@Test
	public void testreturnVehiclevanelse()
	{	
		
		assertEquals(false,v1.returnVehicle(new DateTime(27,02,2020)));
	}@Test
	public void testreturnVehiclecarif()
	{	
		assertEquals(false,v1.returnVehicle(new DateTime(02,02,2020)));
		
	}@Test
	public void testreturnVehiclecarelse()
	{	
		assertEquals(false,v1.returnVehicle(new DateTime(27,02,2020)));
	}
	@Test	
	public void testreturnVehicle3()
	{	
		assertEquals(false,v1.returnVehicle(new DateTime(02,02,2020)));
	}
	@Test	
	public void testreturnVehiclecar1()
	{	
		assertEquals(false,c1.returnVehicle(new DateTime(02,02,2020)));
	}
	
	////////////////////////////////////
	//completeMaintenance
	@Test
	public void testcompleteMaintenance()
	{
		Van v2=new Van("V_1", 20," L"," 1111", 2, van);
		assertEquals(true,v2.completeMaintenance(new DateTime(02,02,2020)));
		
	}
	@Test
	public void testcompleteMaintenance1()
	{
		Van v2=new Van("V_1", 20," L"," 1111", 1, van);
		assertEquals(false,v2.completeMaintenance(new DateTime(01,01,2020)));
		
	}
	@Test
	public void toStringtest()
	{
		Van v=new Van("V_1", 20," L"," 1111", 1, van);
		assertEquals("V_1:20: L: 1111:15:Rented:02/02/2020",v.toString());
	}
	@Test
	public void getDetailstest()
	{
		Van v=new Van("V_1", 20," L"," 1111", 1, van);
		assertEquals("Vehicle ID:V_1 Year:20Make: L Model: 1111 Number of Seats:15Status:Rented\nLast maintenance date:02/02/2020\nRENTAL RECORD:empty" ,v.getDetails());
		//assertEquals("Vehicle ID:V_1 Year:20Make: L Model: 1111 Number of Seats:15\n Status:	Rented\nLast maintenance date:02/02/2020\nRENTAL RECORD" ,v.getDetails());
	}
	

}
