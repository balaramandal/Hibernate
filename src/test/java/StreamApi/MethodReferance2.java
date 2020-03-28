package StreamApi;

//Method Referance Useing instance method;

public class MethodReferance2 {

	public static void main(String[] args) {
		MethodReferance2 m2 = new MethodReferance2();
		
		FunctionalInterface fi = m2::sayHii;
		fi.say();
	}
	public void sayHii(){
		System.out.println("Hiiii Balaram");
	}

}
