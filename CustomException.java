package usingq_Exception;

public class CustomException {
	public CustomException(String string) {
		
	}

	public static void main(String[] args){
//		try {
//			String userName = "aSdmin";
//			int password = 2550;
//			if (userName.equals("admin") && password == 2550) {
//				System.out.println("Login Successful");
//			} else {
//				throw new Task98("Invalid exception");
//			}
//		} catch (Task98 a) {
//			a.getMessage();
//			a.printStackTrace();
//		}
		System.out.println("rest of the code excute");
	}
}

class LoginException extends Exception {
	public LoginException(String a) {
		super(a);
	}
}
