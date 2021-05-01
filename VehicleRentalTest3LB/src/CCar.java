/**
 * 
 */

/**
 * @author lance
 *
 */
public class CCar extends CVehicle{

	public void Initialize(int intWheels, int intMPG){
		SetWheels(intWheels);
		SetMPG(intMPG);
		SetPrice(100);
	}
	/**
	 * 
	 */
	public CCar() {
		Initialize(4, 22);
	}
	public CCar(int intWheels){
		Initialize(intWheels, 22);
	}
	public CCar(int intWheels, int intMPG){
		Initialize(intWheels, intMPG);
	}

	public String GetHowToDrive(){
		return("Turn the steering wheel.");
	}

}
