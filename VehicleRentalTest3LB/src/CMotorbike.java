/**
 * 
 */

/**
 * @author lance
 *
 */
public class CMotorbike extends CVehicle{

	public void Initialize(int intWheels, int intMPG){
		SetWheels(intWheels);
		SetMPG(intMPG);
		SetPrice(150);
	}
	/**
	 * 
	 */
	public CMotorbike() {
		Initialize(2, 40);
	}
	public CMotorbike(int intWheels){
		Initialize(intWheels, 40);
	}
	public CMotorbike(int intWheels, int intMPG){
		Initialize(intWheels, intMPG);
	}

	public String GetHowToDrive(){
		return("Turn the handlebars.");
	}

}
