package corepractice;

import java.util.ArrayList;

public class LinkedListDemo {
	public static void main(String args[]){
		ArrayList<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		li.add(6);
		li.add(7);
		System.out.println(li);
		li.sort((a,b)->b.compareTo(a));
		System.out.println(li);
		
	}
}
