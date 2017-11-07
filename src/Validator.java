import java.util.Scanner;

public class Validator {

	public static String getString(Scanner sc, String prompt) {
		System.out.print(prompt);
		String s = sc.next(); // read user entry
		sc.nextLine(); // discard any other data entered on the line
		return s;
	}

	public static int getInt(Scanner sc) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {

			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}
	
	
    public static int getInt(Scanner sc,int min, int max)
    {
        int i = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            i = getInt(sc);
            if (i < min)
                System.out.println(
                    "Error! Number must be " + min + " or greater.");
            else if (i > max)
                System.out.println(
                    "Error! Number must be " + max + " or less.");
            else
                isValid = true;
        }
        return i;
    }
	
}
