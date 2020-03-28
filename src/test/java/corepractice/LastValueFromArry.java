package corepractice;

public class LastValueFromArry {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int last = 0;
		for(int temp:arr){
			last = temp;
		}
		System.out.println(last);
	}

}
