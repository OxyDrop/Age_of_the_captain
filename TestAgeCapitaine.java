
package exceptions;
public  class TestAgeCapitaine {
	private static final int AGE_MIN = 18, AGE_MAX=67;
	public static boolean testAge(int ageADeviner, int agePropose) throws MauvaisAgeException{
		if(agePropose<AGE_MIN || agePropose>AGE_MAX)
			throw new MauvaisAgeException(agePropose);
		else if(agePropose==ageADeviner)
			return true;
		else if(agePropose<ageADeviner){
			System.out.println("Plus grand");
			return false;
		}else{
			System.out.println("Plus petit");
			return false;
		}
	}
}
