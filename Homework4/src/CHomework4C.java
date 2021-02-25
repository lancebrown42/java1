/**
 *  Takes character input from user and prints a triangle of all preceding chars descending
 *  
 * @author lance brown
 * @version 1.0
 * @since 2021-02-13
 *
 */
import java.io.*;
public class CHomework4C {

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		
		//declare variables
		char chrInput = 0;
		
		//prompt input
		System.out.print("Enter a character: ");
		chrInput = ReadCharacterFromUser();
		
		//print triangle
		for (int i = chrInput; i >= 65; i--) {
			for(int j = chrInput; j >=i; j--) {
				System.out.print((char) j);
			}
			System.out.print("\n");
		}
	}
	
	/**
	 * Method ReadCharacterFromUser
	 * Abstract: Reads character value from user input
	 * @return strInput
	 */
	public static char ReadCharacterFromUser() {
		char chrInput = 0;
		
		try {
			char chrBuffer = 0;
			BufferedReader burInput = new BufferedReader(new InputStreamReader(System.in));
			
			chrBuffer = (char) burInput.read();
			
			chrInput = Character.toUpperCase(chrBuffer);
		} catch(Exception e) {
			System.out.println(e.toString());
		}
		return chrInput;
	}

}
