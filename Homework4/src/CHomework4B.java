/**
 *  Reads an integer value from user and determines if it's even or odd
 *  Reads another integer and checks if it's between 1 and 100
 *  
 * @author lance brown
 * @version 1.0
 * @since 2021-02-13
 *
 */
import java.io.*;
public class CHomework4B {
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		//declare variables
		int intInput = 0;
		String strEvenOdd = "";
		//prompt input
		System.out.print("Enter an integer: ");
		intInput = ReadIntegerFromUser();
		//determine evenness
		strEvenOdd = OddOrEven(intInput);
		//display result
		System.out.print("The number " + intInput + " is " + strEvenOdd + "\n");
		
		//prompt input 2
		System.out.print("Enter an integer between 1 and 100: ");
		intInput = ReadIntegerFromUser();
		//check range
		while(intInput <1 || intInput >100) {
			System.out.print("*******************\n");
			System.out.print("** Out of Range ** \n");
			System.out.print("*******************\n");
			System.out.print("Enter an integer between 1 and 100: ");
			intInput = ReadIntegerFromUser();
		}
		System.out.print("Good job. You entered " + intInput);
	}
	
	/**
	 * Method ReadIntegerFromUser
	 * Abstract: Reads integer value from user input
	 * @return intInput
	 */
	public static int ReadIntegerFromUser() {
		int intInput = 0;
		
		try {
			String strBuffer = "";
			BufferedReader burInput = new BufferedReader(new InputStreamReader(System.in));
			
			strBuffer = burInput.readLine();
			intInput = Integer.parseInt(strBuffer);
		} catch(Exception e) {
			System.out.println(e.toString());
		}
		return intInput;
	}
	/**
	 * Method OddOrEven
	 * Abstract: Determines if an int is odd or even
	 * @return strOddEven
	 * @param intInput
	 */
	public static String OddOrEven(int intInput) {
		String strOddEven = "";
		if(intInput % 2 == 0) {
			strOddEven = "EVEN";
		}else {
			strOddEven = "ODD";
		}
		
		return strOddEven;
		
	}
}
