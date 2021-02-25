/**
 *  Demonstrates for loops and prints some numbers.
 *  
 * @author lance brown
 * @version 1.0
 * @since 2021-02-13
 *
 */
public class CHomework4A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//declare variables
		int i = 0;
		int intSum = 0;
		
		//loops
		System.out.print("Whole numbers between 1 and 100:\n");
		for(i = 1;i<=100;i++) {
			System.out.print(i + "\n");
		}
		
		System.out.print("\nSum of numbers between 1 and 1000: ");
		for(i = 1;i<=1000;i++) {
			intSum += i;
		}
		System.out.print(intSum + "\n");
		
		System.out.print("\nSum of odd numbers between 1 and 300: ");
		intSum = 0;
		for(i = 1;i<=300;i+=2) {
			intSum += i;
		}
		System.out.print(intSum + "\n");
		
		System.out.print("\nSum of even numbers between 2 and 146: ");
		intSum = 0;
		for(i = 2;i<=146;i+=2) {
			intSum += i;
		}
		System.out.print(intSum + "\n");
		
		System.out.print("\nSum of every third number between 2000 and 6: ");
		intSum = 0;
		for(i = 2000;i>=6;i-=3) {
			intSum += i;
		}
		System.out.print(intSum + "\n");


	}

}
