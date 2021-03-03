import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *  TODO
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
	 * 
	 * @param dblGrossPay
	 * @return dblFederalTax
	 */
	public static double calculateFederalTax(double dblGrossPay) {
		double dblFederalTax = 0;
		dblFederalTax += dblGrossPay * dblFederalTaxRate;
		
		return dblFederalTax;
	}
	
	/**
	 * 
	 * @param dblGrossPay
	 * @return dblStateTax
	 */
	public static double calculateStateTax(double dblGrossPay) {
		double dblStateTax = 0;
		dblStateTax += dblGrossPay * dblStateTaxRate;
		return dblStateTax;
	}
	
	/**
	 * 
	 * @param dblGrossPay
	 * @return dblLocalTax
	 */
	public static double calculateLocalTax(double dblGrossPay) {
		double dblLocalTax = 0;
		dblLocalTax += dblGrossPay * dblLocalTaxRate;
		return dblLocalTax;
	}
	
	
	/**
	 * 
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
