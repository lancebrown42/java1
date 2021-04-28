/**
 *  Cat Object inherits Animal
 *  
 * @author lance brown
 * @version 1.0
 * @since 2021-03-30
 *
 */
public class CCat extends CAnimal {
	/**
	 * Method Constructor
	 * @param strName name
	 */
	public CCat(String strName) {
		// TODO Auto-generated constructor stub
		SetName(strName);
		SetType("Cat");
	}
	public void MakeNoise() {
		Meow();
	}
	/**
	 * Method Meow
	 * Abstract Prints meow
	 */
	public void Meow() {
		System.out.println("Meow");
	}
}
