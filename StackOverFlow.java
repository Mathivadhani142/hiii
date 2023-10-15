package usingq_Exception;

public class StackOverFlow {
	public static void main(String[] args) {
     Stack s = new Stack();
     System.out.println(s.a());
	}
}


class Stack{
	public float a() {
		return b();
	}
	public float b() {
		return a();
	}
}