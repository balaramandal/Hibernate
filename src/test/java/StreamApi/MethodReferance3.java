package StreamApi;

//Method Referance useing constructor.

public class MethodReferance3 {
	
	public MethodReferance3(){
		System.out.println("Hiii Balaram.");
	}

	public static void main(String[] args) {
		FunctionalInterface fi = MethodReferance3::new;
		fi.say();
	}
	
}
