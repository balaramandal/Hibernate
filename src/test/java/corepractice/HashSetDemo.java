package corepractice;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		Integer[] arr = {1,5,2,2,8,1,2,6,3,2,6};
		TreeSet<Integer> hash = new TreeSet();
		Collection<Integer> col = Arrays.asList(arr);
		hash.addAll(col);
		hash.add(9);
		System.out.println(hash);
	}

}
