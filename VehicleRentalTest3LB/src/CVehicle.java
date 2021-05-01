/**
 * 
 */

/**
 * @author lance
 *
 */
public class CVehicle {
	private int m_intWheels;
	private int m_intMPG;
	private int m_intPricePerDay;

	public void SetWheels(int intWheels){
		m_intWheels = intWheels;
	}
	public int GetWheels(){
		return m_intWheels;
	}
	public void SetMPG(int intMPG){
		m_intMPG = intMPG;
	}
	public int GetMPG(){
		return m_intMPG;
	}
	public String GetHowToDrive(){
		return ("Wheels spin");
	}
	public void SetPrice(int intPrice){
		m_intPricePerDay = intPrice;
	}
	public int GetPrice(){
		return m_intPricePerDay;
	}


}
