package corepractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String args[]){
		HashSet hs = new HashSet();
		hs.add("Rishi");
		hs.add(1);
		hs.add(2);
		System.out.println("This is Output of HashSet \n "+hs);
		
		LinkedHashSet li = new LinkedHashSet();
		li.add("Rishi");
		li.add(1);
		li.add(2);
		System.out.println("This is Output of LinkedHashSet \n "+li);
		
		TreeSet set = new TreeSet<>();
		set.add(2);
		set.add(1);
		set.add(10);
		System.out.println(set);
	}
}
