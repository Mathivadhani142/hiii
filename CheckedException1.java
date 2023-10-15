package usingq_Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException1{
	public static void main(String[] args) throws FileNotFoundException , Exception {
File a = new File("C:/Users/Admin/Documents/moni.txt");
FileReader read = new FileReader(a); 
int temp = 0;
while((temp=read.read())!=-1) {
	System.out.println((char)(temp));
	
}
	
	
	
	
	
	
	
	}
}
