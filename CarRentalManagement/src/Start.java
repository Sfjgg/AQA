import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.runner.JUnitCore;

import java.sql.Date;

/**
 * This class contains the main method .
 * It calls a function called run() which is used to the entire program
 */
public class Start{
	public static String main(String[] args)
	{
		
		ThriftyRentSystem rentSystem =new ThriftyRentSystem();
		
		rentSystem.run();
		return "pass";	
	}
}








