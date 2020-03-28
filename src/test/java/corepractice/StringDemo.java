package corepractice;

public class StringDemo {
	String s = "Balaram";
	public static void main(String args[]){
		
		String s1 = "Aa";
		String s2 = new String("BB");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
		StringDemo d1 = new StringDemo();
		StringDemo d2 = new StringDemo();
		
		System.out.println(d1.equals(d2));
		
		System.out.println(d1 == d2);
	
	}
}
