
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *  TODO
 *  
 * @author lance brown
 * @version 1.0
 * @since 2021-02-24
 *
 */
public class CHomework6LB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * 
	 * @param strInput
	 * @return intCount
	 */
	public static int VowelCount(String strInput) {
		
		//declare variables
		int intCount = 0;
		int intLength = 0;
		
		
		//assign
		intLength = strInput.length();
		
		//loop for vowel check
		for(int i = 0; i < intLength; i++) {
			switch(Character.toUpperCase(strInput.charAt(i))){
			case 'A': 
				intCount++;
				break;
			case 'E':
				intCount++;
				break;
			case 'I':
				intCount++;
				break;
			case 'O':
				intCount++;
				break;
			case 'U':
				intCount++;
				break;
			default:
				break;
			}
		}
		
		
		return intCount;
	}
	
	/**
	 * 
	 * @param strInput
	 * @param chrInput
	 * @return intIndex
	 */
	public static int FindIndexOfChar(String strInput, char chrInput) {
		//declare vars
		int intIndex = 0;
		int intLength = 0;
		
		//find first occurence
		intLength = strInput.length();
		for(int i = 0; i < intLength; i++) {
			if(strInput.charAt(i) == chrInput) {
				intIndex = i;
				break;
			}
		}
		return intIndex;
	}
	
	/**
	 * 
	 * @param strInput
	 * @param chrInput
	 * @return intCount
	 */
	
	public static int CountLetter(String strInput, char chrInput) {
		//declare variables
		int intCount = 0;
		int intLength = 0;
		
		intLength = strInput.length();
		for(int i = 0; i < intLength; i++) {
			if(Character.toUpperCase(strInput.charAt(i)) == Character.toUpperCase(chrInput)) {
				intCount++;
			}
		}
		return intCount;
	}
	
	/**
	 * 
	 * @param strSource
	 * @param intLength
	 * @return strSub
	 */
	public static String Left(String strSource, int intLength) {
		char[] strSub = new char[intLength];
		for(int i = 0; i < intLength; i++) {
			strSub[i] = strSource.charAt(i);
		}
		
		return strSub.toString();
	}
	
	public static String VBSubString(String strSource, int intLength, int intStartIndex) {
		char[] strSub = new char[intLength];
		for(int i=intStartIndex; i < intStartIndex + intLength; i++) {
			strSub[i] = strSource.charAt(i);
		}
		return strSub.toString();
	}

}
