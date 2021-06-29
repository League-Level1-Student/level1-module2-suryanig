package _06_tea_party;

public class TeaParty {
	/**
 	 * Jane Austen is a woman, so say “Hello Ms. Austen”. 
 	 * George Orwell is a man, so say “Hello Mr. Orwell”. 
 	 * Isaac Newton was knighted, so say "Hello Sir Isaac Newton".
 	 **/

	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		// TODO Auto-generated method stub
		String greeting = "Hello ";
		if (isWoman) {
			if(isKnighted) {
				greeting += "Lady ";
			}
			else {
				greeting += "Ms. ";
			}
		}
		else {
			if(isKnighted) {
				greeting += "Sir ";
			}
			else {
				greeting += "Mr. ";
			}
		}
		greeting += name;
		return greeting;
	}

}
