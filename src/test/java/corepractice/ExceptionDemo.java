package corepractice;

public class ExceptionDemo {
	public static void main(String args[]){
		try{
			System.out.println(5/0);
		}catch(Exception ex){
			System.out.println("Insiden Exce");
		}finally{
			System.out.println("inside finally");
		}
	}
}
