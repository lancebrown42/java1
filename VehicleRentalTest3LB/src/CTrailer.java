/**
 * 
 */

/**
 * @author lance
 *
 */
public class CTrailer extends CVehicle{

	public void Initialize(int intWheels){
		SetWheels(intWheels);
		SetPrice(50);
	}
	/**
	 * 
	 */
	public CTrailer() {
		Initialize(2);
	}
	public CTrailer(int intWheels){
		Initialize(intWheels);
	}

	public String GetHowToDrive(){
		return("Use another vehicle to pull.");
	}
	public int GetMPG(){
		return 0;
	}
}
