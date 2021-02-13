/**
 *  The program calculates age in seconds, the volume of the sun and earth, and the number of molecules in a glass of water
 *  
 * @author lance brown
 * @version 1.0
 * @since 2021-02-05
 *
 */
public class Homework3 {

	public static void main(String astrCommandLine[ ] ) {
		//---------------------------------------------------------------------------
		//Problem 1: Age in seconds
		//---------------------------------------------------------------------------
		
		//declare variables
		int intAge = 0;
		int intAgeinDays = 0;
		int intSecondsInDay = 0;
		int intDaysInAYear = 0;
		int intSecondsAlive = 0;
		
		//assign variables
		intAge = 30;
		intDaysInAYear = 365;
		
		//calculate
		intAgeinDays = intAge * intDaysInAYear;
		intSecondsInDay = 24*60*60; //hours in day * minutes in hour * seconds in minute
		intSecondsAlive = intAgeinDays * intSecondsInDay;
		
		//display
		System.out.print("I am " + intAge + " years old, which means I've been alive for at least " + intSecondsAlive + " seconds.\n");
		
		
		//---------------------------------------------------------------------------
		//Problem 2: Volume of Sun, Earth and ratio of the two
		//---------------------------------------------------------------------------
		
		//declare variables
		int intDiameterOfSun = 0;
		int intDiameterOfEarth = 0;
		float fltVolumeOfSun = 0;
		float fltVolumeOfEarth = 0;
		float fltSunEarthRatio = 0;
		
		//assign variables
		intDiameterOfSun = 865000;
		intDiameterOfEarth = 7600;
		
		//calculate
		fltVolumeOfSun = (float) (4 * Math.PI * Math.pow(intDiameterOfSun / 2,3)) / 3;
		fltVolumeOfEarth = (float) (4 * Math.PI * Math.pow(intDiameterOfEarth / 2,3)) / 3;
		fltSunEarthRatio = (float) fltVolumeOfSun / fltVolumeOfEarth;
		
		//Display
		System.out.print("The sun has a volume of " + fltVolumeOfSun + " cubic miles\n");
		System.out.print("The earth has a volume of " + fltVolumeOfEarth + " cubic miles\n");
		System.out.print("The ratio of Sun : Earth volumes is " + fltSunEarthRatio + " : 1\n");
		
		
		//---------------------------------------------------------------------------
		//Problem 3: Number of molecules in 2.45 quarts of water.
		//---------------------------------------------------------------------------
		
		//declare variables
		float fltVolumeOfWater = 0;
		float fltMassOfWaterMolecule = 0;
		float fltMassOfQuart = 0;
		float fltMoleculesInVolume = 0;
		
		//Assign variables
		fltVolumeOfWater = 2.45F;
		fltMassOfWaterMolecule = 3e-23F;
		fltMassOfQuart = 950F;
		
		//calculate
		fltMoleculesInVolume = (fltVolumeOfWater * fltMassOfQuart) / fltMassOfWaterMolecule;
		
		//display
		System.out.print("There are approximately " + fltMoleculesInVolume + " molecules in " + fltVolumeOfWater + " quarts of water\n");


	}

}
