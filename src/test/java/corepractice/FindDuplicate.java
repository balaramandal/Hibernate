package corepractice;

public class FindDuplicate {

	public static void main(String[] args) {
		String s ="balaram";
		String temp = "";
		char[] x = s.toCharArray();
		for(char c : x){
			if(!temp.contains(String.valueOf(c))){
				temp = temp+String.valueOf(c);
			}
		}
		System.out.println(temp);
	}
}
