import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *  Pay check takes user input for hours worked and pay rate
 *  and calculates gross and net pay with a tax breakdown
 *  
 * @author lance brown
 * @version 1.0
 * @since 2021-03-01
 *
 */
public class PayCheckLB {
	//constant declarations
	final static double dblFederalTaxRate = 0.25;
	final static double dblStateTaxRate = 0.07;
	final static double dblLocalTaxRate = 0.025;
	final static double dblFICATaxRate = 0.0475;

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {

		
		
		while(true) {//loop until break
			//variable declarations
			
			double dblHoursWorked = 0;
			double dblPayRate = 0;
			double dblGrossPay = 0;
			double dblNetPay = 0;
			double dblFederalTax = 0;
			double dblStateTax = 0;
			double dblLocalTax = 0;
			double dblFICATax = 0;
			
			System.out.print("Please enter number of hours worked or 0 to end program: ");
			dblHoursWorked = ReadDoubleFromUser();
			if(dblHoursWorked == 0) {
				break;
			}
			System.out.print("Please enter the payrate or 0 to end program: ");
			dblPayRate = ReadDoubleFromUser();
			if(dblPayRate == 0) {
				break;
			}
			dblGrossPay = calculatePay(dblHoursWorked, dblPayRate);
			dblFederalTax = calculateFederalTax(dblGrossPay);
			dblStateTax = calculateStateTax(dblGrossPay);
			dblLocalTax = calculateLocalTax(dblGrossPay);
			dblFICATax = calculateFICATax(dblGrossPay);
			dblNetPay = dblGrossPay - dblFederalTax - dblStateTax - dblLocalTax - dblFICATax;
			System.out.printf("Your Gross Pay is--> %.2f\n", dblGrossPay);
			System.out.printf("Federal is --------> %.2f\n", dblFederalTax);
			System.out.printf("State Tax is-------> %.2f\n", dblStateTax);
			System.out.printf("Local Tax is-------> %.2f\n", dblLocalTax);
			System.out.printf("FICA Tax is--------> %.2f\n", dblFICATax);
			System.out.println("-----------------------");
			System.out.printf("Net Pay is---------> %.2f\n", dblNetPay);
			System.out.println();
			
		
		}
		System.out.println("Pay Check Calculator Program Ended");
	}
	
	/**
	 * Calculates gross pay from hours worked and pay rate
	 * @param dblHoursWorked
	 * @param dblPayRate
	 * @return dblGrosPay
	 */
	public static double calculatePay(double dblHoursWorked, double dblPayRate) {
		double dblGrossPay = 0;
		if(dblHoursWorked > 40) {
			dblGrossPay += 1.5 * dblPayRate * (dblHoursWorked - 40);
			dblHoursWorked = 40;
		}
		dblGrossPay+= dblPayRate * dblHoursWorked;
		
		return dblGrossPay;
	}
	/**
	 * Calculates federal tax
	 * @param dblGrossPay
	 * @return dblFederalTax
	 */
	public static double calculateFederalTax(double dblGrossPay) {
		double dblFederalTax = 0;
		dblFederalTax += dblGrossPay * dblFederalTaxRate;
		
		return dblFederalTax;
	}
	
	/**
	 * calculates state tax
	 * @param dblGrossPay
	 * @return dblStateTax
	 */
	public static double calculateStateTax(double dblGrossPay) {
		double dblStateTax = 0;
		dblStateTax += dblGrossPay * dblStateTaxRate;
		return dblStateTax;
	}
	
	/**
	 * calculates local tax
	 * @param dblGrossPay
	 * @return dblLocalTax
	 */
	public static double calculateLocalTax(double dblGrossPay) {
		double dblLocalTax = 0;
		dblLocalTax += dblGrossPay * dblLocalTaxRate;
		return dblLocalTax;
	}
	
	
	/**
	 * calculates FICA tax
	 * @param dblGrossPay
	 * @return dblFICATax
	 */
	public static double calculateFICATax(double dblGrossPay) {
		double dblFICATax = 0;
		dblFICATax += dblGrossPay * dblFICATaxRate;
		return dblFICATax;
	}

	
	/**
	 * Method ReaddoubleFromUser
	 * Abstract: Reads integer value from user input
	 * @return intInput
	 */
	public static double ReadDoubleFromUser() {
		double dblInput = 0;
		
		try {
			String strBuffer = "";
			BufferedReader burInput = new BufferedReader(new InputStreamReader(System.in));
			
			strBuffer = burInput.readLine();
			dblInput = Float.parseFloat(strBuffer);
		} catch(Exception e) {
			System.out.println(e.toString());
			dblInput = ReadDoubleFromUser();
		}
		return dblInput;
	}

}
