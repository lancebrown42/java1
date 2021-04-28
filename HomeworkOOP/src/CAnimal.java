
/**
 *  Default Animal Object
 *  
 * @author lance brown
 * @version 1.0
 * @since 2021-03-30
 *
 */
public class CAnimal {

	private String m_strName;
	private String m_strType;

	/**
	 * Method SetName
	 * Abstract Name Setter
	 * @param strName Name
	 */
	public void SetName(String strName) {
		if(strName.length() > 50) {
			strName = strName.substring(0, 49);
		}
		m_strName = strName;
		}
	/**
	 * Method GetName
	 * Abstract Name Getter
	 * @return m_strName
	 */
	public String GetName() {
		return m_strName;
	}
	/**
	 * Method SetType
	 * Abstract Type Setter
	 * @param strType Type
	 */
	public void SetType(String strType) {
		if(strType.length() > 50) {
			strType = strType.substring(0, 49);
		}
		m_strType = strType;
	}
	/**
	 * Method GetType
	 * Abstract Type Getter
	 * @return m_strType
	 */
	public String GetType() {
		return m_strType;
	}
	/**
	 * Method MakeNoise
	 * Abstract Makes noise for animal
	 */
	public void MakeNoise() {
		System.out.println("Undefined");
	}


}
