/**
 *  Trained dog inherited from Dog
 *  
 * @author lance brown
 * @version 1.0
 * @since 2021-03-30
 *
 */
public class CTrainedDog extends CDog{
	/**
	 * 
	 */
	/**
	 * Method Constructor
	 * @param strName Name
	 * @param dblWeight weight
	 * @param intAge age
	 * @param strBreed breed
	 */
	public CTrainedDog(String strName, double dblWeight, int intAge, String strBreed) {
		super(strName, dblWeight, intAge);
		SetType("Trained Dog");
		SetBreed(strBreed);
	}
	private String m_strBreed;
	/**
	 * Method SetBreed
	 * Abstract Breed setter
	 * @param strBreed breed
	 */
	public void SetBreed(String strBreed) {
		int intMaxIndex = 10;
		if(strBreed.length() > intMaxIndex) {
			strBreed = strBreed.substring(0, intMaxIndex);
		}
		m_strBreed = strBreed;
	}
	/**
	 * Method GetBreed
	 * Abstract Breed getter
	 * @return m_strBreed
	 */
	public String GetBreed() {
		return m_strBreed;
	}
	/**
	 * Method PlayDead
	 * Abstract Prints output simulating playing dead
	 */
	public void PlayDead() {
		if(GetAge()<5) {
			System.out.println("Tomorrow and tomorrow and tomorrow,\n"
					+ "Creeps in this petty pace from day to day\n"
					+ "To the last syllable of recorded time;\n"
					+ "And all our yesterdays have lighted fools\n"
					+ "The way to dusty death.\n"
					+ "Out, out, brief candle!");
			
		}else {
			System.out.println("I'd rather not contemplate the inevitable");
		}
	}
	/**
	 * Method FetchNewspaper
	 * Abstract Prints output simulating paper fetching
	 */
	public void FetchNewspaper() {
		if(GetAge() < 2) {
			System.out.println("I will destroy that newspaper!");
		}
		else {
			System.out.println("Here's your newspaper, I'll put it directly in the trash because you haven't consumed print media in years.");
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
		System.out.println("Breed:\t" + GetBreed());
		
		Bark();
		Fetch();
		PlayDead();
		
		
		System.out.println();
		System.out.println();
	}
}
