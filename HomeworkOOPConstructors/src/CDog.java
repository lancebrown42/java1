/**
 *  Dog Object inherits Animal
 *  
 * @author lance brown
 * @version 1.0
 * @since 2021-04-05
 *
 */
public class CDog extends CAnimal {

	private double m_dblWeight;
	private int m_intAge;

	/**
	 * Method Initialize
	 * @param strName name
	 * @param dblWeight weight
	 * @param intAge age
	 */
	public void Initialize(String strName, double dblWeight, int intAge) {
		SetName(strName);
		SetType("Dog");
		SetWeight(dblWeight);
		SetAge(intAge);
	}
	public CDog() {
		Initialize("", 0, 0);
	}
	public CDog(String strName) {
		Initialize(strName, 0, 0);
	}
	public CDog(String strName, int intAge) {
		Initialize(strName, 0, intAge);
	}
	public CDog(String strName, double dblWeight, int intAge) {
		Initialize(strName, dblWeight, intAge);
	}
	/**
	 * Method SetWeight
	 * Abstract Weight setter
	 * @param dblNewWeight weight
	 */
	public void SetWeight(double dblNewWeight) {
		if(dblNewWeight < 0) {
			dblNewWeight = 0;
		}
		m_dblWeight = dblNewWeight;
	}
	/**
	 * Method GetWeight
	 * Abstract weight getter
	 * @return m_dblWeight
	 */
	public double GetWeight() {
		return m_dblWeight;
	}
	/**
	 * Method SetAge
	 * Abstract Age Setter
	 * @param intNewAge age
	 */
	public void SetAge(int intNewAge) {
		if(intNewAge < 0) {
			intNewAge = 0;
		}
		m_intAge = intNewAge;
	}
	/**
	 * Method GetAge
	 * Abstract Age getter
	 * @return m_intAge
	 */
	public int GetAge() {
		return m_intAge;
	}

	public void MakeNoise() {
		Bark();
	}
	/**
	 * Method Bark
	 * Abstract Makes bark noise
	 */
	public void Bark() {
		if(GetWeight() < 15) {
			System.out.println("Yip yip");
		}
		else {
			System.out.println("Woof woof");
		}
	}
	/**
	 * Method Fetch
	 * Abstract prints output simulating fetch
	 */
	public void Fetch() {
		if(GetAge() > 10) {
			System.out.println("Hey dude. That stick was just fine where it was. I'm napping.");
		}
		else {
			System.out.println("You dropped your stick very far away. I will quickly return it");
		}
	}
	/**
	 * Method Print
	 * Abstract Prints summary of dog
	 */
	public void Print() {
		System.out.println("Name:\t" + GetName());
		System.out.println("Age:\t" + GetAge());
		System.out.println("Weight:\t" + GetWeight());

		
		Bark();
		Fetch();
		
		
		System.out.println();
		System.out.println();
	}

}
