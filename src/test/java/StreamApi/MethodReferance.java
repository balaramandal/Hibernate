package StreamApi;

//Method referance useing static method.

public class MethodReferance {
	
	public static void main(String[] args) {
		FunctionalInterface fi = MethodReferance::sayHii;  
		fi.say();
	}
	public static void sayHii(){
		System.out.println("Hiii Balaram");
	}

}
