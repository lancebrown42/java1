/**
 *  Cow Object inherits Animal
 *  
 * @author lance brown
 * @version 1.0
 * @since 2021-03-30
 *
 */
public class CCow extends CAnimal{
	private String m_strColor;
	/**
	 * Method Constructor
	 * @param strName name
	 * @param strColor color
	 */
	public CCow(String strName, String... strColor) {
		SetName(strName);
		SetType("Cow");
		SetColor(strColor[0]);
	}
	/**
	 * Method SetColor
	 * Abstract color setter
	 * @param strNewColor color
	 */
	public void SetColor(String strNewColor) {
		int intStopIndex = 0;
		
		if(strNewColor.equals("") == true) {
			strNewColor="Brown";
		}
		intStopIndex = strNewColor.length();
		if(intStopIndex > 10) {
			intStopIndex = 10;
		}
		m_strColor = strNewColor.substring(0, intStopIndex);
	}
	/**
	 * Method GetColor
	 * Abstract Color getter
	 * @return m_strColor
	 */
	public String GetColor() {
		return m_strColor;
	}
	/**
	 * Method Graze
	 * Abstract Prints output simulating grazing
	 */
	public void Graze() {
		System.out.println("I'm built to eat something with virtually no nutritional content.\nI'm enormous.\nI'm condemned to a life of constant eating.");
	}

	public void MakeNoise() {
		System.out.println("Mooo");
	}
}
