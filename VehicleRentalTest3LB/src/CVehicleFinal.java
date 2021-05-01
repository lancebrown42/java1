import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.*;
/**
 * 
 */

/**
 * @author lance
 *
 */
public class CVehicleFinal {

	/**
	 * Method main
	 * Abstract TODO
	 * @param args
	 */
	public static void main(String[] args) {
		String strCustomerName = "";
		String strPhone = "";
		String strEmail = "";
		int intRentalDays = 0;
		int intNumberOfVehicles = 0;
		int intVehicle = 0;
		int[] aintVehicleTypes;
		int intPricePerDay = 0;
		int intTotalPrice = 0;

		System.out.println("Customer Name: ");
		strCustomerName = ReadStringFromUser();
		do {
			System.out.println("Phone Number: ");
			strPhone = ReadStringFromUser();
		} while(!IsValidPhoneNumber(strPhone));
		do{
			System.out.println("Email: ");
			strEmail = ReadStringFromUser();
		} while(!IsValidEmail(strEmail));
		System.out.println("Number of Rental Days: ");
		intRentalDays = ReadIntegerFromUser();
		do{
			System.out.println("Number of vehicles to rent (1-3): ");
			intNumberOfVehicles = ReadIntegerFromUser();
		}
		while(!IsValidVehicleNumber(intNumberOfVehicles));
		aintVehicleTypes = new int[intNumberOfVehicles];
		for(int i = 0; i < intNumberOfVehicles; i++){
			System.out.printf("Type of vehicle %d-\n", i+1);
			System.out.print("1) Car\n2) Motorbike\n3) Trailer\n");
			intVehicle = ReadIntegerFromUser();
			if(IsValidVehicleNumber(intVehicle)){
				aintVehicleTypes[i] = intVehicle;
			}else{
				i--;
			}
		}
		
		

	}
	
	/**
	 * Method IsValidPhoneNumber
	 * Abstract TODO
	 * @param strPhone
	 * @return
	 */
	public static boolean IsValidPhoneNumber(String strPhone) {
		boolean blnValid = false;
		Pattern patPhone = Pattern.compile("^((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$");
		blnValid = patPhone.matcher(strPhone).matches();
		if(!blnValid){
			System.out.println("INVALID PHONE");
		}
		return blnValid;
	}
	
	/**
	 * Method IsValidEmail
	 * Abstract TODO
	 * @param strEmail
	 * @return
	 */
	public static boolean IsValidEmail(String strEmail) {
		boolean blnValid = false;
		Pattern patEmail = Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");
		blnValid = patEmail.matcher(strEmail).matches();
		if(!blnValid){
			System.out.println("INVALID EMAIL");
		}
		return blnValid;
	}
	
	public static boolean IsValidVehicleNumber(int intVehicle) {
		boolean blnValid = false;
		if(intVehicle > 0 && intVehicle <=3){
			blnValid = true;
		}
		else{
			System.out.println("INVALID INPUT. ENTER 1 2 OR 3");
		}
		return blnValid;
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
	/**
	 * Method ReadStringFromUser
	 * Abstract Reads string from user input
	 * @return strInput
	 */
	public static String ReadStringFromUser() {
		String strInput = "";
		
		try {
			String strBuffer = "";
			BufferedReader burInput = new BufferedReader(new InputStreamReader(System.in));
			
			strBuffer = burInput.readLine();
			try {
				if(!Float.isNaN(Float.parseFloat(strBuffer))) {//check if input is numeric
					throw new Exception("Input is not a string");
				}
			} catch(Exception f) {
				
			}
			strInput = strBuffer;
		} catch(Exception e) {
			System.out.println("Invalid input: " + e.toString());
			strInput = ReadStringFromUser();
		}
		return strInput;
	}


}
