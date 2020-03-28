package corepractice;

public class FindTheFirstHieghest {

	public static void main(String[] args) {
		int[] values = {8,5,4,7,8,5,5,5,81,8};
		int firstHieghest = 0;
		int secondHieghest = 0;
		int lowest = 0;
		for(int temp : values){
			if(temp>firstHieghest){
				secondHieghest = firstHieghest;
				firstHieghest = temp;
			}if(lowest<secondHieghest){
				lowest = temp;
			}
		}
		System.out.println("First Hieghest Number : "+firstHieghest+"\nsecond Hieghest Number : "+secondHieghest+"\n Lowest Number : "+lowest);
	}

}
