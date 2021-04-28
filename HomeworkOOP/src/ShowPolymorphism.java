/**
 *  Main Method to demonstrate polymorphism in Java OOP
 *  
 * @author lance brown
 * @version 1.0
 * @since 2021-03-30
 *
 */

public class ShowPolymorphism {

	/**
	 * Method main
	 * Abstract main
	 * @param args
	 */
	public static void main(String[] args) {
		CAnimal aclsZoo[] = new CAnimal[7];
		CCat clsCat = new CCat("Hank");
		CCow clsCow = new CCow("Bessie", "Black");
		CDog clsDog = new CDog("Pup", 5, -1);
		CDragon clsDragon = new CDragon("Villentretenmerth", 1);
		CDuck clsDuck = new CDuck("Donald");
		CTrainedDog clsTrainedDog = new CTrainedDog("Tank", 60, 8, "Staffordshire Terrier");
		String strAnimalType;
		aclsZoo[0] = clsCat;
		aclsZoo[1] = clsCow;
		aclsZoo[2] = clsDog;
		aclsZoo[3] = null;
		aclsZoo[4] = clsDragon;
		aclsZoo[5] = clsDuck;
		aclsZoo[6] = clsTrainedDog;
		
		System.out.println("Polymorphism - The world's worst zoo");
		System.out.println("----------------------------------------");
		for(int i = 0; i<aclsZoo.length; i++) {
			if(aclsZoo[i]!= null ) {
				System.out.println("Animal in cage #" + (i +1));
				System.out.println("Name: " + aclsZoo[i].GetName());
				System.out.println("Type: " + aclsZoo[i].GetType());
				
				strAnimalType = aclsZoo[i].GetType();
				
				if(strAnimalType.equals("Dog") == true){
					((CDog) aclsZoo[i]).Fetch();
				}
				else if(strAnimalType.equals("Trained Dog") == true) {
					((CTrainedDog) aclsZoo[i]).PlayDead();
					((CTrainedDog) aclsZoo[i]).FetchNewspaper();
					((CTrainedDog) aclsZoo[i]).Print();
				}
				else if(strAnimalType.equals("Cow") == true) {
					((CCow) aclsZoo[i]).Graze();
					System.out.println("Color: " + (((CCow) aclsZoo[i]).GetColor()));
				}
				else if(strAnimalType.equals("Dragon") == true) {
					((CDragon) aclsZoo[i]).BreatheFire();
				}
				
				aclsZoo[i].MakeNoise();
				
				System.out.println();
			}
		}

	}

}
