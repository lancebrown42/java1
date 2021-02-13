/**
 *  The MyFirstPgm program implements an application that
 *  displays numeric data type min and max values and confirms with overflow/underflow
 *  
 * @author lance brown
 * @version 1.0
 * @since 2021-01-26
 *
 */
public class CHomework2B {

	public static void main(String astrCommandLine[]) {
		//Declare Variables
		short shtMinimum = 0;
		short shtMaximum = 0;
		int intMinimum = 0;
		int intMaximum = 0;
		long lngMinimum = 0;
		long lngMaximum = 0;
		float fltMinimum = 0;
		float fltMaximum = 0;
		
		//set to min/max
		shtMinimum = -32768;
		shtMaximum = 32767;
		intMinimum = Integer.MIN_VALUE;
		intMaximum = Integer.MAX_VALUE;
		lngMinimum = (long) -2e63;
		lngMaximum = (long) (2e63 -1);
		fltMinimum = (float) -Float.MAX_VALUE;
		fltMaximum = (float) Float.MAX_VALUE;
		
		//print min/max
		System.out.print("Short Data Type ---------------------------------------------------\n");
		System.out.print("\tMinimum: " + shtMinimum + "\n");
		System.out.print("\tMaximum: " + shtMaximum + "\n");
		System.out.print("\n");
		// confirm by subtracting and adding one
		shtMinimum -= 1;
		shtMaximum += 1;
		System.out.print("Confirmation\n");
		System.out.print("\tMinimum: " + shtMinimum + "\n" );
		System.out.print("\tMaximum: " + shtMaximum + "\n" );
		System.out.print( "\n" );
		//************
		//Confirmed, shorts wrap to max and min when over/underflowed
		//************
		//int
		System.out.print("Integer Data Type ---------------------------------------------------\n");
		System.out.print("\tMinimum: " + intMinimum + "\n");
		System.out.print("\tMaximum: " + intMaximum + "\n");
		System.out.print("\n");
		// confirm by subtracting and adding one
		intMinimum -= 1;
		intMaximum += 1;
		System.out.print("Confirmation\n");
		System.out.print("\tMinimum: " + intMinimum + "\n" );
		System.out.print("\tMaximum: " + intMaximum + "\n" );
		System.out.print( "\n" );
		//************
		//Confirmed, ints wrap to max and min when over/underflowed
		//************
		//long
		System.out.print("Long Data Type ---------------------------------------------------\n");
		System.out.print("\tMinimum: " + lngMinimum + "\n");
		System.out.print("\tMaximum: " + lngMaximum + "\n");
		System.out.print("\n");
		// confirm by subtracting and adding one
		lngMinimum -= 1;
		lngMaximum += 1;
		System.out.print("Confirmation\n");
		System.out.print("\tMinimum: " + lngMinimum + "\n" );
		System.out.print("\tMaximum: " + lngMaximum + "\n" );
		System.out.print( "\n" );
		//************
		//Confirmed, longs wrap to max and min when over/underflowed
		//************
		//float
		System.out.print("Float Data Type ---------------------------------------------------\n");
		System.out.print("\tMinimum: " + fltMinimum + "\n");
		System.out.print("\tMaximum: " + fltMaximum + "\n");
		System.out.print("\n");
		// confirm by subtracting and adding one
		fltMinimum -= (float) 1;
		fltMaximum += (float) 1;
		System.out.print("Confirmation\n");
		System.out.print("\tMinimum: " + fltMinimum + "\n" );
		System.out.print("\tMaximum: " + fltMaximum + "\n" );
		System.out.print("\tNOT CONFIRMED\n");
		System.out.print( "\n" );
		// ^does not work due to precision and rounding^
		// V try higher order of magnitude V
		fltMinimum -= 1E32;
		fltMaximum += 1E32;
		System.out.print("Higher order of magnitude Confirmation\n");
		System.out.print("\tMinimum: " + fltMinimum + "\n" );
		System.out.print("\tMaximum: " + fltMaximum + "\n" );
		System.out.print( "\n" );
		//************
		//Confirmed, floats go to +-infinity when over/underflowed
		//************

	}

}
