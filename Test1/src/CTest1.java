import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *  Test1 takes loan information from user input and generates an amortization schedule
 *  
 * @author lance brown
 * @version 1.0
 * @since 2021-02-19
 *
 */
public class CTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//header
		System.out.print("Lance Brown = Loan Amortization Schedule \nClass - IT-161-400\n\n");
		
		//declare variables
		double dblLoanAmount = 0;
		int intTerm = 0;
		double dblRate = 0;
		double dblMonthlyInterest = 0;
		double dblMonthlyPayment = 0;
		double dblTotalPayment = 0;
		double dblPrincipal = 0;
		double dblBalance = 0;
		double dblInterest = 0;

		//prompt input
		System.out.print("Enter Loan Amount:\n");
		dblLoanAmount = ReaddoubleFromUser();


		System.out.print("Enter Number of Years:\n");
		intTerm = ReadIntegerFromUser();


		System.out.print("Enter Annual Interest Rate:\n");
		dblRate = ReaddoubleFromUser();

		
		//Calculate monthly interest
		dblMonthlyInterest = dblRate / 1200;
		
		// Calculate monthly payment
		dblMonthlyPayment = dblLoanAmount * dblMonthlyInterest / (1 - 1 / Math.pow(1 + dblMonthlyInterest, intTerm * 12));
		
		// Calculate total payment
		dblTotalPayment = (dblMonthlyPayment * 12) * intTerm;
		// display monthly payment
		System.out.printf("Monthly Payment: %.2f\n", dblMonthlyPayment);
		
		//display total payment
		System.out.printf("Total Payment: %.2f\n", dblTotalPayment);
		
		// Display schedule
		System.out.println("Payment #\tInterest\tPrincipal\tBalance");
		dblBalance = (double) dblLoanAmount; 
		for(int month = 1; month <= intTerm * 12; month++) {
			dblInterest = dblBalance * dblMonthlyInterest;
			dblPrincipal = dblMonthlyPayment - dblInterest;
			dblBalance -= dblPrincipal;
			
			System.out.printf("%-10d\t%-10.2f\t%-10.2f\t%-10.2f\n", month,dblInterest, dblPrincipal, dblBalance);
		}

	}
	
	/**
	 * Method CalculateMonthlyInterest
	 * Abstract: Calculates monthly interest payment
	 * @return dblMonthlyInterestPayment
	 * @param intTerm, dblMonthlyInterest
	 */
	public static double CalculateMonthlyInterest(int intTerm) {
		double dblMonthlyInterest = 0;
		
		return dblMonthlyInterest;
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
	 * Method ReaddoubleFromUser
	 * Abstract: Reads integer value from user input
	 * @return intInput
	 */
	public static double ReaddoubleFromUser() {
		double dblInput = 0;
		
		try {
			String strBuffer = "";
			BufferedReader burInput = new BufferedReader(new InputStreamReader(System.in));
			
			strBuffer = burInput.readLine();
			dblInput = Float.parseFloat(strBuffer);
		} catch(Exception e) {
			System.out.println(e.toString());
			dblInput = ReaddoubleFromUser();
		}
		return dblInput;
	}

}



