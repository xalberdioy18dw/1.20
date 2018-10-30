import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TextFile {
	public static void main(String[] args) {
		//Try is necessary to executate the text file as an argument with the scanner class.
		try {
			// It creates a new file with argument 0
			File textfile = new File(args[0]);
			// The scanner will executate that file
			Scanner sc = new Scanner(textfile);
			// We create a loop
			while (sc.hasNextLine()) {
				// We create a new object i
	            String i = sc.nextLine();
	            System.out.println(i);
			}
			// In the exception case, it will print that
		} catch (FileNotFoundException e) {
			System.out.println("File is not founded.");
		}
		
	}
}

