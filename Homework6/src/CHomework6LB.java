


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
		String strBuffer;
		int intVowelCount = 0;
		int intLetterIndex = 0;
		int intLetterCount = 0;
		int intWordCount = 0;
		
		
		//Problem 1 - Count Vowels
		intVowelCount = VowelCount("I Love Java");
		System.out.println("Vowel Count=" + intVowelCount);
		
		//PRoblem 2- Find Letter
		intLetterIndex = FindIndexOfChar("I Love Java", 'J');
		System.out.println("Letter index=" + intLetterIndex);
		
		//Problem 3- Count letter
		intLetterCount = CountLetter("I Love Java", 'A');
		System.out.println("Letter Count=" + intLetterCount);
		
		//Problem 4- Left
		strBuffer = Left("I Love Java", 3);
		System.out.println("Left(3)=" + strBuffer);
		
		//Problem 5- Right
		strBuffer = Right("I Love Java", 3);
		System.out.println("Right(3)=" + strBuffer);
		
		//Problem 6- VB SubString
		strBuffer = VBSubString("I Love Java", 2, 4);
		System.out.println("VB SubString="+ strBuffer);
		
		//Problem 7- Java SubString
		strBuffer = JavaSubString("I Love Java", 2, 6);
		System.out.println("Java SubString=" + strBuffer);
		
		//Problem 8- Java Compare
		String strSource = "I Love Java";
		if(CompareStrings(strSource, new String("I Love Java")) == true) {
			System.out.println("Same");
		}
		else {
			System.out.println("Different");
		}
		
		//Problem 9- Count Words
		intWordCount=CountWordsInString("     I      Love Java     Class     ");
		System.out.println("Word Count=" + intWordCount);
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
	 * Finds index of first occurrence of given char
	 * @param strInput
	 * @param chrInput
	 * @return intIndex
	 */
	public static int FindIndexOfChar(String strInput, char chrInput) {
		//declare vars
		int intIndex = 0;
		int intLength = 0;
		
		//find first occurrence
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
		char[] chrSub = new char[intLength];
		for(int i = 0; i < intLength; i++) {
			chrSub[i] = strSource.charAt(i);
		}
		String strSub = new String(chrSub);
		return strSub;
	}
	
	/**
	 * 
	 * @param strSource
	 * @param intLength
	 * @return strSub
	 */
	public static String Right(String strSource, int intLength) {
		char[] chrSub = new char[intLength];
		for(int i = 0; i < intLength; i++) {
			chrSub[i] = strSource.charAt(strSource.length() - 1 - i);
		}
		
		String strSub = new String(chrSub);
		return strSub;
	}
	/**
	 * 
	 * @param strSource
	 * @param intLength
	 * @param intStartIndex
	 * @return strSub
	 */
	
	public static String VBSubString(String strSource, int intStartIndex, int intLength) {
		char[] chrSub = new char[intLength];
		int intEndIndex = intStartIndex + intLength;
		if(intEndIndex >= strSource.length()) {
			intEndIndex = strSource.length() - 1;
		}
		for(int i=intStartIndex; i < intEndIndex; i++) {
			chrSub[i - intStartIndex] = strSource.charAt(i);
		}
		String strSub = new String(chrSub);
		return strSub;
		
	}
	
	/**
	 * 
	 * @param strSource
	 * @param intStartIndex
	 * @param intStopIndex
	 * @return strSub
	 */
	public static String JavaSubString(String strSource, int intStartIndex, int intStopIndex) {
		int intLength = intStopIndex - intStartIndex;
		char[] chrSub = new char[intLength];
		for(int i=intStartIndex; i < intStartIndex + intLength; i++) {
			chrSub[i-intStartIndex] = strSource.charAt(i);
		}
		
		String strSub = new String(chrSub);
		return strSub;
	}
	
	/**
	 * 
	 * @param strLeft
	 * @param strRight
	 * @return blnSame
	 */
	public static boolean CompareStrings(String strLeft, String strRight) {
		boolean blnSame = false;
		int intLength = 0;
		if(strLeft.length() == strRight.length()) {
			intLength = strLeft.length();
			for(int i =0; i <intLength; i++) {
				if(strLeft.charAt(i) == strRight.charAt(i)) {
					blnSame = true;
				}
				else {
					blnSame = false;
					break;
				}
			}
			
		}
		
		return blnSame;
	}
	
	/**
	 * Counts the words in a string
	 * @param strSource
	 * @return intCount
	 */
	
	public static int CountWordsInString(String strSource) {
		int intCount = 0;
		int intLength = 0;
		
		intLength = strSource.length();
		for(int i = 0; i < intLength; i++) {
			if(i+1 < intLength) {
				if(strSource.charAt(i)!= ' ' && strSource.charAt(i+1) == ' ') {
					intCount++;
				}
			}
			else if(strSource.charAt(i) != ' '){
				intCount++;
			}
		}
		
		return intCount;
	}
	

}
