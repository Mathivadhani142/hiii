package usingq_Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {
	public static void main(String[] args) throws FileNotFoundException, Exception {
		try {
			File f = new File("C://Users/Admin/Documents/text.txt");

			FileReader fr = new FileReader(f);
			int temp = 0;
			while ((temp = fr.read()) != -1) {
				System.out.println((char) (temp));
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
}
