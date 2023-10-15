package usingq_Exception;

public class Demo {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace(); // entha line error show pannu
		} catch (Exception e) {
			System.out.println(e);
		}

		finally {
			System.out.println("");
		}
		System.out.println("hii");

		// Numberformat
//		String e = "hi";
//		int num = Integer.parseInt(e);

	}
//

}
