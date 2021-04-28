import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 *  Builds an array of Integers from user input and manipulates it in various ways based on further input
 *  
 * @author lance brown
 * @version 1.0
 * @since 2021-03-09
 *
 */
public class ArrayDemoLB {

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		int aintValues[];
		aintValues = MakeArray();
		PopulateArray(aintValues);
		PrintArray(aintValues);
		System.out.printf("Average value of array: %.2f\n", CalcAvg(aintValues));
		System.out.printf("Max value in Array: %d \n", FindMax(aintValues));
		System.out.println("Input an int to append to the array: ");
		aintValues = Append(aintValues, ReadIntegerFromUser());
		PrintArray(aintValues);
		System.out.println("Input an int to prepend to the array: ");
		aintValues = Prepend(aintValues, ReadIntegerFromUser());
		PrintArray(aintValues);
		System.out.println("Input an int and an index at which to insert it in the array: ");
		aintValues = Insert(aintValues, ReadIntegerFromUser(), ReadIntegerFromUser());
		PrintArray(aintValues);
		System.out.println("Input an index to remove from the array: ");
		aintValues = RemoveValue(aintValues, ReadIntegerFromUser());
		PrintArray(aintValues);

		
	}
	/**
	 * Method MakeArray
	 * Abstract: Sizes array from user input
	 * @return aintValues
	 */
	public static int[] MakeArray() {
		int aintValues[];
		int intLength = -1;
		while (intLength <  0|| intLength > 100) {
			System.out.print("Enter an int between 0 and 100 to represent the length of the Array: ");
			intLength = ReadIntegerFromUser();
		}
		aintValues = new int[intLength];
		
		return aintValues;
	}
	/**
	 * Method PopulateArray
	 * Abstract: Populates array with user input
	 * @param aintValues
	 */
	public static void PopulateArray(int[] aintValues) {
		for(int i = 0; i < aintValues.length; i++) {
			System.out.printf("Enter integer value %d: ", i+1);
			aintValues[i] = ReadIntegerFromUser();
			
		}
	}
	/**
	 * Method PrintArray
	 * Abstract Prints the array as table index : value
	 * @param aintValues
	 */
	public static void PrintArray(int[] aintValues) {
		System.out.println();
		System.out.println(" Array Values");
		System.out.println("index    value");
		System.out.println("---------------");
		for(int i = 0; i < aintValues.length; i++) {
			System.out.printf("%5d %9d\n", i, aintValues[i]);
		}
	}
	
	/**
	 * Method CalcAvg
	 * Abstract Calculates the average of all values in array
	 * @param aintValues
	 * @return dblAverage
	 */
	public static double CalcAvg(int[] aintValues) {
		double dblAverage = 0;
		int intSum = 0;
		for(int i =0; i < aintValues.length; i++) {
			intSum += aintValues[i];
		}
		if(aintValues.length > 0) {
			dblAverage = intSum / aintValues.length;
		}
		return dblAverage;
	}
	
	/**
	 * Method FindMax
	 * Abstract Find the maximum value of the array
	 * @param aintValues
	 * @return intMax
	 */
	public static int FindMax(int[] aintValues) {
		int intMax = 0;
		for (int i : aintValues) {
			if(i > intMax ) {
				intMax = i;
			}
		}
		
		return intMax;
	}
	
	/**
	 * Method Append
	 * Abstract Adds value to the end of the array
	 * @param aintValues
	 * @param intValue
	 * @return aintNewArray
	 */
	public static int[] Append(int[] aintValues, int intValue) {
		int[] aintNewArray = new int[aintValues.length + 1];
		for(int i = 0; i < aintValues.length; i++) {
			aintNewArray[i]= aintValues[i]; 
		}
		aintNewArray[aintValues.length] = intValue;
		return aintNewArray;
		
	}
	/**
	 * Method Prepend
	 * Abstract Adds value to beginning of array
	 * @param aintValues
	 * @param intValue
	 * @return aintNewArray
	 */
	public static int[] Prepend(int[] aintValues, int intValue) {
		int[] aintNewArray = new int[aintValues.length + 1];
		for(int i = 0; i < aintValues.length; i++) {
			aintNewArray[i+1]= aintValues[i]; 
		}
		aintNewArray[0] = intValue;
		return aintNewArray;
		
	}
	/**
	 * Method Insert
	 * Abstract Inserts given value at given index
	 * @param aintValues
	 * @param intValue
	 * @param intIndex
	 * @return aintNewArray
	 */
	public static int[] Insert(int[] aintValues, int intValue, int intIndex) {
		int[] aintNewArray = new int[aintValues.length + 1];
		if(intIndex < 0) {
			intIndex = 0;
		} else if(intIndex > aintValues.length){
			intIndex = aintValues.length;
		}
		
			for(int i = 0; i < intIndex; i ++) {
				aintNewArray[i]= aintValues[i]; 
			}
			aintNewArray[intIndex] = intValue;
			for(int i = intIndex; i < aintValues.length; i++) {
				aintNewArray[i+1] = aintValues[i];
			}
		
		return aintNewArray;
		
	}
	 /**
	 * Method RemoveValue
	 * Abstract Removes value at given index
	 * @param aintValues
	 * @param intIndex
	 * @return aintNewArray
	 */
	public static int[] RemoveValue(int[] aintValues, int intIndex) {
		if(aintValues.length == 0) {
			return aintValues;
		}
		 int[] aintNewArray = new int[aintValues.length - 1];
		 if(intIndex < 0) {
				intIndex = 0;
			} else if(intIndex > aintValues.length - 1){
				intIndex = aintValues.length - 1;
			}

			for(int i = 0; i < intIndex; i ++) {
				aintNewArray[i]= aintValues[i]; 
			}
			for(int i = intIndex; i < aintValues.length - 1; i++) {
				aintNewArray[i] = aintValues[i+1];
			}
		 
			
		 
		 return aintNewArray;
		 
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
			intInput = ReadIntegerFromUser();
		}
		return intInput;
	}

	
}
