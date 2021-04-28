/**
 *  Duck Object inherits Animal
 *  
 * @author lance brown
 * @version 1.0
 * @since 2021-03-30
 *
 */
public class CDuck extends CAnimal{
	/**
	 * Method Constructor
	 * @param strName name
	 */
	public CDuck(String strName) {
		SetName(strName);
		SetType("Duck");
	}

	public void MakeNoise() {
		System.out.println("Quack");
	}
}
