
import java.util.Scanner;

public class CountryApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		boolean continueApp = true;
		System.out.println("Welcome to the Countries Maintenance Application");
		while (continueApp) {
			System.out.println("1 - See the list of countries");
			System.out.println("2 - Add a country");
			System.out.println("3 - Exit");
//			int userChoice = scnr.nextInt();
			int userChoice = Validator.getInt(scnr, 1, 3);
			
			
			switch (userChoice) {
			case 1:
				CountriesTextFile.listCountries();
				break;
			case 2:
				
				System.out.println("Enter country");
				String userCountry = scnr.nextLine();
				CountriesTextFile.addCountry(userCountry);
				break;
			case 3:
				System.out.println("Good Bye!");
				continueApp = false;
				scnr.close();
			default:
				break;
			}
		}

	}

}
