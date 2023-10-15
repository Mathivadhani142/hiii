package usingq_Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileOverFlow {
	public static void main(String [] args) throws FileNotFoundException, IOException {

		try {
			File a = new File("C:/Users/Admin/Documents/pas.txt");
			FileReader aa = new FileReader(a);
			int file = 0;
			while ((file = aa.read()) != -1) {
				System.out.println((char) (file));
			}
		} catch (FileNotFoundException aa) {
			System.out.println(aa + "Unknown file");
		} finally {
			System.out.println(" \n " + "Rest of the code will be executed ");
		}

	}
}


