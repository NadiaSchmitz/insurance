import Prog1Tools.IOTools;

public class Main {

	public static void main(String[] args) {
		
		int alter, prozentsatz;
		
		alter = IOTools.readInteger("Wie alt sind Sie? ");
		prozentsatz = 100;
		
		if (alter > 18 & alter < 60) {
			if (alter >= 25 & alter <= 35) {
				prozentsatz = 95;
				System.out.println("Sie haben " + prozentsatz + "% zu bezahlen.");
			} else {
				System.out.println("Sie haben " + prozentsatz + "% zu bezahlen.");
			}
		} else {
			System.out.println("Sie können nicht angenommen werden.");
		}
		
	}

}
