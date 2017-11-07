import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountriesTextFile {

	public static void listCountries() {
		{
			Path writeFile = Paths.get("countries.txt");
			File file = writeFile.toFile();

			try {
				FileReader fr = new FileReader(file);
				// this is a buffer and the befinit of using this is to store a block of memory
				// that we can read data from later -- more efficient than Scanner
				BufferedReader reader = new BufferedReader(fr);
				// Attempting to read first line from text document
				String line = reader.readLine();

				while (line != null) {
					System.out.println(line);
					line = reader.readLine();
				}

			} catch (IOException e) {
				System.out.println("File not found");
				e.printStackTrace();
			}
		}
	}

	public static void addCountry(String userCountry) {
		Path writeFile = Paths.get("countries.txt");
		File file = writeFile.toFile();

		try {
			PrintWriter out = new PrintWriter(new FileOutputStream(file, true));
			System.out.println("Adding country to document");
			out.println("\n"+ userCountry);
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("File was not found");
			e.printStackTrace();
		}
	}
}
