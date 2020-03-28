package corepractice;

class StaticParent{
	public static void main(String args[]){
		System.out.println("this is inside parent class main method");
	}
}
public class StaticDemo extends StaticParent{
	public static void main(String args[]){
		System.out.println("this is main method of child class");
	}
}
