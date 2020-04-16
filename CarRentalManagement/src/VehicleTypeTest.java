import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VehicleTypeTest {
private VehicleType van;
private VehicleType car;
private Van v;
private Van c;
@Before
public void init()
{
	v=new Van("V_1", 20, "L", "1111", 2, van);
	c=new Van("C_1", 20, "L", "1111", 1, car);
	car=new VehicleType(4);
	van= new VehicleType(15,new DateTime(29,02,2020));
	
	
}
	@Test
	public void testVehicleTypeInt() {
		assertEquals(4,car.getSeats("car"));
	}
	@Test
	public void testsetLastMaintenance() {
		assertEquals(true,van.setLastMaintenance(new DateTime(02,02,2020)));
	}
	@Test
	public void testVehicleTypeIntDateTime() {
		assertEquals(15,van.getSeats("van"));
	}
	@Test
    public void testgetLastMaintenance(){
		assertEquals(new DateTime(29,02,2020),van.getLastMaintenance());
	}
  
	@Test
	public void testGetSeats() {
		assertEquals(4,car.getSeats("car"));
	}
	@Test
	public void testSetCarSeats() {
		assertEquals(4,car.getSeats("car"));
	}
	@Test
	public void testgetCarSeats() {
		assertEquals(4,car.getCarSeats());
	}
	@Test
	public void testcanBeRentedForMinimumDays1() {
		assertEquals(2,car.canBeRentedForMinimumDays(new DateTime(02,02,2020), "car"));
		
	}
	@Test
	public void testcanBeRentedForMinimumDays2() {
	
		assertEquals(1,van.canBeRentedForMinimumDays(new DateTime(02,02,2020), "van"));
	}@Test
	public void testcanBeRentedForMinimumDays3() {
		assertEquals(3,car.canBeRentedForMinimumDays(new DateTime(01,02,2020), "car"));
	}
	@Test
	public void testIsUnderMaintenancevan1() {
		
		assertEquals(false,van.IsUnderMaintenance(new DateTime(04,02,2020), "van", 2));
		
	}
	@Test
	public void testIsUnderMaintenancevan2() {
		
		
		assertEquals(false,van.IsUnderMaintenance(new DateTime(02,02,2020), "car", 0));
		
	}
}


