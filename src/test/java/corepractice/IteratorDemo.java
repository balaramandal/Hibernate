package corepractice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Rishi");
		al.add("Balaram");
		al.add("Amit");
		al.add("Genious");
		al.add("Kanhu");
		al.add("Santunu");
		
		Iterator itr  = al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
