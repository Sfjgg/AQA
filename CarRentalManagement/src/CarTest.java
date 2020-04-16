import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {
private Car c;
private Car v;
private Car c0;
private Car v0;
private VehicleType van;
private VehicleType car;
//private RentalRecord r;
@Before

 public void init(){
	car=new VehicleType(4);
	van= new VehicleType(15,new DateTime(02,02,2020));
	//r=new RentalRecord("34",new DateTime(02,02,2020),new DateTime(06,02,2020));

	c=new Car("C_1", 20, "L", "1111", 0, car);
	v=new Car("V_1", 20, "L", "1111", 1, van);
	c0=new Car("C_1", 20, "L", "1111", 0, car);
	v0=new Car("V_1", 20, "L", "1111", 2, van);
	}
//1
	@Test
	public void testgetLateFeeif() {
	assertEquals(390.0 ,c.getLateFee(new DateTime(06,02,2020),new DateTime(02,02,2020)),0.0 );			
	}
	//2
	@Test
	public void testgetLateFeeelse() {
	assertEquals(0.0 ,c.getLateFee(new DateTime(02,02,2020),new DateTime(02,02,2020)),0.0 );		
	}//3
	@Test
	public void testreturnVehiclecar() {
	assertEquals(false ,c0.returnVehicle(new DateTime(04,02,2020)) );		
	}//4
	@Test
	public void testreturnVehiclevenif() {
	assertEquals(false ,c.returnVehicle(new DateTime(02,02,2020)) );	
	}//5
	@Test
	public void testreturnVehiclevenelse() {	
	assertEquals(true ,v.returnVehicle(new DateTime(02,02,2020)) );	
	}
}
