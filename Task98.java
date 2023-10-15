package usingq_Exception;

public class Task98 {

public static void main(String[] args) {
	
	//    UNCHECKED EXCEPTIONS
	
	// 1.Arithmetic exception  //..........................................
	
	int a = 10;
	int b = 0;
try {
	System.out.println(a/b);
}
catch(ArithmeticException q) {
	System.out.println("not divisable"+ q);
	
}
	
	//2.Null pointer exception//..........................................
	
	String c = null;
	//System.out.println(c.toLowerCase());
	
	//3.numberFormat exception//..........................................
	
	String d = "mathi";
	//int number = Integer.parseInt(d);
	
	//4. IndexOutOfBounds exception//.....................................
	
	int [] num = {10,20};
	//System.out.println(num[2]);  //   ArrayIndexOutOf Bounds
	
	String word = "mathi";
    // System.out.println(word.charAt(word.length()));   //StringIndexOutOfBounds
	
	
	
}
}