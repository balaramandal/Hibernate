package corepractice.collection;

import static org.junit.Assert.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
class SetDem{
	public static String findDuplicate(Collection<Integer> collection){
		return collection.contains(1) ? "Yes" : "No";
	}
}
public class SetDemo {

	@Test
	public void testContains() {
		Set<Integer> set = new HashSet<Integer>();
		set.add(8);
		set.add(5);
		set.add(2);
		set.add(4);
		set.add(6);
		set.add(9);
		set.add(1);
		set.add(3);
		set.add(9);
		
		assertEquals("Yes", SetDem.findDuplicate(set));
	}
	
	

}
