package usingq_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IO_Exception {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter the Age");
	try {
	
	int a = scan.nextInt();
	System.out.println(a);
	}
	catch(InputMismatchException w) {
		System.out.println(w);
		
	}
}
}
