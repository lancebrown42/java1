/**
 *  Dragon Object inherits Animal
 *  
 * @author lance brown
 * @version 1.0
 * @since 2021-03-30
 *
 */
public class CDragon extends CAnimal{
	
	private int m_intHeadCount = 1;
	
	/**
	 * Method Constructor
	 * @param strName Name
	 * @param intHeadCount Number of heads
	 */
	public CDragon(String strName, int intHeadCount) {
		SetName(strName);
		SetType("Dragon");
		SetHeadCount(intHeadCount);
	}
	/**
	 * Method SetHeadCount
	 * Abstract Headcount setter
	 * @param intHeadCount number of heads
	 */
	public void SetHeadCount(int intHeadCount) {
		if(intHeadCount < 1) {
			intHeadCount = 1;
		}
		m_intHeadCount = intHeadCount;
	}
	/**
	 * Method GetHeadCount
	 * Abstract Headcount getter
	 * @return m_intHeadCount
	 */
	public int GetHeadCount() {
		return m_intHeadCount;
	}
	/**
	 * Method BreatheFire
	 * Abstract Prints output simulating breathing fire
	 */
	public void BreatheFire() {
		if(GetHeadCount() ==1) {
			System.out.println("The dragon breathes fire.");
		}
		else {
			System.out.println("The dragons breathes fire from each of its " + GetHeadCount() + " terrible maws");
			for(int i = 0; i < GetHeadCount(); i++) {
				System.out.println("****Breathe Fire****");
			}
		}
	}

	public void MakeNoise() {
		System.out.println("I am a dragon, but does that make me a monster?");
	}
}
