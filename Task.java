package usingq_Exception;

public class Task {
//	public void a() {
//		this.a();
//	}
	public static void main (String [] args) {
//    		   Task v = new Task();
//    		   v.a();
		
    		   try {

    	            Class.forName("com.javaguides.corejava.Demo");

    	         //  ClassLoader.getSystemClassLoader().loadClass("com.javaguides.corejava.Demo");

    	        } catch (ClassNotFoundException e) {
    	            System.out.println(" this file is not found ");
    	        	//e.printStackTrace();
    	        }
	
	
	}
	}

