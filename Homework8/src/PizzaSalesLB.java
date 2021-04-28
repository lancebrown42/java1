import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *  Reads transaction information from user and calculates and displays metrics
 *  
 * @author lance brown
 * @version 1.0
 * @since 2021-03-15
 *
 */
public class PizzaSalesLB {

	/**
	 * Method main
	 * Abstract main method
	 * @param args null
	 */
	public static void main(String[] args) {
		
		int intSalesCount = 0;
		int intEmplyoees = 0;
		double[] adblTransactions;
		double dblTotalSales = 0;
		double dblCommission = 0;
		System.out.println("Enter the total number of sales for the day: ");
		intSalesCount = ReadIntegerFromUser();
		adblTransactions = GetTransactionsFromUser(intSalesCount);
		System.out.println("Enter the number of employees: ");
		intEmplyoees = ReadIntegerFromUser();
		dblTotalSales = CalcSum(adblTransactions);
		dblCommission = EmployeeCommission(dblTotalSales);
		System.out.printf("Total sales of the day : \t\t$%7.2f\n", dblTotalSales);
		System.out.printf("Highest sale for the day : \t\t$%7.2f\n", FindMax(adblTransactions));
		System.out.printf("Lowest sale of the day : \t\t$%7.2f\n", FindMin(adblTransactions));
		System.out.printf("Average sale amount for the day : \t$%7.2f\n", CalcAvg(adblTransactions, dblTotalSales));
		System.out.printf("Total employee commission is : \t\t$%7.2f\n", dblCommission);
		System.out.printf("Per employee commission amount : \t$%7.2f\n", dblCommission / intEmplyoees);
		
	}
	/**
	 * Method GetTransactionsFromUser
	 * Abstract Reads transaction amounts from user
	 * @param intSalesCount Quantity of sales for the day
	 * @return adblTransactions
	 */
	public static double[] GetTransactionsFromUser(int intSalesCount) {
		double[] adblTransactions = new double[intSalesCount];
		
		for(int i = 0; i < intSalesCount; i++) {
			System.out.printf("Enter ticket %d amount: ", i+1);
			adblTransactions[i] = ReaddoubleFromUser();
		}
		return adblTransactions;
	}
	
	/**
	 * Method CalcSum
	 * Abstract calculates the sum of all transactions
	 * @param adblTransactions Array of transaction amounts
	 * @return dblSum
	 */
	public static double CalcSum(double[] adblTransactions) {

		double dblSum = 0;
		for(int i =0; i < adblTransactions.length; i++) {
			dblSum += adblTransactions[i];
		}
		
		return dblSum;
	}
	
	/**
	 * Method CalcAvg
	 * Abstract Calculates average of transactions
	 * @param adblTransactions Array of transaction amounts
	 * @param dblSum Sum total of all transactions
	 * @return dblAverage
	 */
	public static double CalcAvg(double[] adblTransactions, double dblSum) {
		double dblAverage = 0;
		dblAverage = dblSum / adblTransactions.length;
		return dblAverage;
	}
	
	/**
	 * Method FindMax
	 * Abstract Finds maximum value
	 * @param adblTransactions Array of transaction amounts
	 * @return dblMax
	 */
	public static double FindMax(double[] adblTransactions) {
		double dblMax = 0;
		for (double i : adblTransactions) {
			if(i > dblMax ) {
				dblMax = i;
			}
		}
		
		return dblMax;
	}
	
	/**
	 * Method FindMin
	 * Abstract finds minimum value
	 * @param adblTransactions Array of transaction amounts
	 * @return dblMin
	 */
	public static double FindMin(double[] adblTransactions) {
		double dblMin = Double.POSITIVE_INFINITY;
		for (double i : adblTransactions) {
			if(i < dblMin ) {
				dblMin = i;
			}
		}
		
		return dblMin;
	}
	
	/**
	 * Method EmployeeCommission
	 * Abstract Calculates 2% commission of the total
	 * @param dblTotalSales Sum of daily transactions
	 * @return dblCommission
	 */
	public static double EmployeeCommission(double dblTotalSales) {
		double dblCommission = 0;
		dblCommission = dblTotalSales *.02;
		return dblCommission;
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
