import java.io.BufferedReader;
import java.io.InputStreamReader;



/**
 *  Takes pay data from the user and generates paystub information 
 *  
 * @author lance brown
 * @version 1.0
 * @since 2021-03-23
 *
 */
public class PaystubLB {

	/**
	 * Method main
	 * Abstract main method
	 * @param args args
	 */
	
	public static void main(String[] args) {
		String strName = "";
		double dblWage = 0;
		double dblHours = 0;
		int intWitholdings = 0;
		String strMarried = "";
		Boolean blnMarried;
		double dblIncome = 0;
		double dblMedicareTax = 0;
		double dblSSATax = 0;
		double dblFICATax = 0;
		double dblTaxWitheld = 0;
		double dblNetIncome = 0;
		double dblTotalGross = 0;
		double dblTotalMedicare = 0;
		double dblTotalSSA = 0;
		double dblTotalFICA = 0;
		double dblTotalWitheld = 0;
		double dblTotalNet = 0;
		double[] adblTotalGross = new double [0];
		double[] adblTotalMedicare = new double [0];
		double[] adblTotalSSA = new double [0];
		double[] adblTotalFICA = new double [0];
		double[] adblTotalWitheld = new double [0];
		double[] adblTotalNet = new double [0];

		
		
		System.out.println("Paystub Calculator");
		System.out.println("-------------------------------------------------------");
		while(true) {
			strName = "";
			dblWage = 0;
			dblHours = 0;
			intWitholdings = 0;
			strMarried = "";
			dblIncome = 0;
			dblMedicareTax = 0;
			dblSSATax = 0;
			dblFICATax = 0;
			dblTaxWitheld = 0;
			dblNetIncome = 0;
			System.out.println("Employee Name:(type 'Quit' to end program)");
			strName = ReadStringFromUser();
			if(strName.toUpperCase().equals("QUIT")) {
				break;
			}
			System.out.print("Hourly wage: ");
			dblWage = ReaddoubleFromUser();
			System.out.print("Hours Worked: ");
			dblHours = ReaddoubleFromUser();
			System.out.print("Witholding Exemptions: ");
			intWitholdings = ReadIntegerFromUser();
			while(!strMarried.toUpperCase().equals("S") && !strMarried.toUpperCase().equals("M")) {
				System.out.print("Marital Status (S = Single, M = Married): ");
				strMarried = ReadStringFromUser();
				if(!strMarried.toUpperCase().equals("S") && !strMarried.toUpperCase().equals("M")) {
					System.out.println("Enter S for single or M for Married");
				}
			}
			dblIncome = CalcIncome(dblWage, dblHours);
			dblMedicareTax = dblIncome * 0.0145;
			dblSSATax = dblIncome * 0.062;
			dblFICATax = dblMedicareTax + dblSSATax;
			blnMarried = strMarried.toUpperCase().equals("M") ? true : false;
			dblTaxWitheld = CalcWitholding(dblIncome, intWitholdings, blnMarried);
			dblNetIncome = dblIncome - dblMedicareTax - dblSSATax - dblTaxWitheld;
			PrintPayStub(strName, dblIncome, dblMedicareTax, dblSSATax, dblFICATax, dblTaxWitheld, dblNetIncome);
			adblTotalGross = 	Append(adblTotalGross, dblIncome);
			adblTotalMedicare =	Append(adblTotalMedicare, dblMedicareTax);
			adblTotalSSA =  	Append(adblTotalSSA, dblSSATax);
			adblTotalFICA = 	Append(adblTotalFICA, dblFICATax);
			adblTotalWitheld = 	Append(adblTotalWitheld, dblTaxWitheld);
			adblTotalNet = 		Append(adblTotalNet, dblNetIncome);

			dblTotalGross = Sum(adblTotalGross);
			dblTotalMedicare  = Sum(adblTotalMedicare);
			dblTotalSSA  = Sum(adblTotalSSA);
			dblTotalFICA  = Sum(adblTotalFICA);
			dblTotalWitheld  = Sum(adblTotalWitheld);
			dblTotalNet  = Sum(adblTotalNet);
			
		}

		System.out.println("Grand Paycheck Totals------------------------");
		System.out.println("---------------------------------------------");
		System.out.printf("%-40s $%10.2f\n", "Total Gross Income:", dblTotalGross);
		System.out.printf("%-40s $%10.2f\n", "Total Medicare Tax:", dblTotalMedicare);
		System.out.printf("%-40s $%10.2f\n", "Total Social Security Tax:", dblTotalSSA);
		System.out.printf("%-40s $%10.2f\n", "Total FICA Tax:", dblTotalFICA);
		System.out.printf("%-40s $%10.2f\n", "Total Income Tax Witheld:", dblTotalWitheld);
		System.out.printf("%-40s $%10.2f\n", "Total Net Income:", dblTotalNet);
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");

		
	}
	/**
	 * Method CalcIncome
	 * Abstract calculates gross income from wages and hours
	 * @param dblWage Hourly pay rate
	 * @param dblHours Hours Worked
	 * @return dblIncome
	 */
	public static double CalcIncome(double dblWage, double dblHours) {
		double dblIncome = 0;
		if(dblHours > 40) {
			dblIncome += dblWage * 1.5 * (dblHours - 40);
			dblHours = 40;
		}
		dblIncome += dblWage * dblHours;
		
		return dblIncome;
	}
	/**
	 * Method CalcWitholding
	 * Abstract Calculates witholding based on witholding elections, AGI and marriage status
	 * @param dblIncome Gross Income
	 * @param intWitholdings Whitholding Elections
	 * @param blnMarried MArriage status
	 * @return dblTaxWitheld
	 */
	public static double CalcWitholding(double dblIncome, int intWitholdings, boolean blnMarried) {
		double dblTaxWitheld = 0;
		double dblAGI = dblIncome - (55.77 * intWitholdings);
		if(blnMarried) {
			if(dblAGI > 5000) {
				dblTaxWitheld = 600.5 + .2 * (dblAGI - 5000);
			} else if(dblAGI >= 2501) {
				dblTaxWitheld = 225.5 + .15 * (dblAGI - 2500);
			}
			else if(dblAGI >= 501) {
				dblTaxWitheld = 22.5 + .1 * (dblAGI - 500);
			}
			else if(dblAGI >= 51) {
				dblTaxWitheld = .05 * (dblAGI - 51);
			}
			else {
				dblTaxWitheld = 0;
			}
		}
		else {
			if(dblAGI > 5000) {
				dblTaxWitheld = 845 + .25 * (dblAGI - 5000);
			} else if(dblAGI >= 2501) {
				dblTaxWitheld = 345 + .2 * (dblAGI - 2500);
			}
			else if(dblAGI >= 501) {
				dblTaxWitheld = 45 + .15 * (dblAGI - 500);
			}
			else if(dblAGI >= 51) {
				dblTaxWitheld = .1 * (dblAGI - 51);
			}
			else {
				dblTaxWitheld = 0;
			}
		}
		return dblTaxWitheld;
	}
	
	/**
	 * Method PrintPayStub
	 * Abstract Prints paystub output to console
	 * @param strName Name
	 * @param dblIncome Gross Income
	 * @param dblMedicareTax Medicare tax
	 * @param dblSSATax Social Security Tax
	 * @param dblFICATax Combined Medicare and SSA taxes
	 * @param dblWitholding Federal Taxes witheld
	 * @param dblNetIncome calculated net minus taxes
	 */
	public static void PrintPayStub(String strName, double dblIncome, double dblMedicareTax, double dblSSATax, double dblFICATax, double dblWitholding, double dblNetIncome) {
		System.out.printf("Paycheck for %s\n", strName);
		System.out.printf("%-40s $%10.2f\n", "Gross Income:", dblIncome);
		System.out.printf("%-40s $%10.2f\n", " less Medicare Tax:", dblMedicareTax);
		System.out.printf("%-40s $%10.2f\n", " less Social Security Tax:", dblSSATax);
		System.out.printf("%-40s $%10.2f\n", " less FICA Tax:", dblFICATax);
		System.out.printf("%-40s $%10.2f\n", " less Federal Income Tax Witheld:", dblWitholding);
		System.out.printf("%-40s $%10.2f\n", "Net Income:", dblNetIncome);
		System.out.println("---------------------------------------------");
		System.out.println();
		
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
			if(intInput < 0) {
				throw new Exception("Cannot be negative");
			}
		} catch(Exception e) {
			System.out.println("Invalid input: " + e.toString());
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
			if(dblInput < 0) {
				throw new Exception("Cannot be negative");
			}
		} catch(Exception e) {
			System.out.println("Invalid input: " + e.toString());
			dblInput = ReaddoubleFromUser();
		}
		
		return dblInput;
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
	/**
	 * Method Append
	 * Abstract Adds value to the end of the array
	 * @param adblValues Array to be added to
	 * @param dblValue value to be appended
	 * @return adblNewArray
	 */
	public static double[] Append(double[] adblValues, double dblValue) {
		double[] adblNewArray = new double[adblValues.length + 1];
		for(int i = 0; i < adblValues.length; i++) {
			adblNewArray[i]= adblValues[i]; 
		}
		adblNewArray[adblValues.length] = dblValue;
		return adblNewArray;
		
	}

	
	/**
	 * Method Sum
	 * Abstract Adds values of array together
	 * @param adblValues Array of values to be summed
	 * @return dblTotal
	 */
	public static double Sum(double[] adblValues) {
		double dblTotal = 0;
		for(double value : adblValues) {
			dblTotal += value;
		}
		return dblTotal;
	}

}

