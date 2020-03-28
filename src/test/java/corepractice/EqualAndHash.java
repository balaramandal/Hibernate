package corepractice;

import java.util.HashSet;
import java.util.Set;

public class EqualAndHash {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		EqualAndHash other = (EqualAndHash) obj;
		if (id == other.id)
			return true;
		else
			return false;
	}
	
	public EqualAndHash(int id) {
		this.id = id;
	}

	public static void main(String[] args) {
		
		Set<EqualAndHash>  set = new HashSet<EqualAndHash>();
		set.add(new EqualAndHash(1));
		set.add(new EqualAndHash(2));
		set.add(new EqualAndHash(1));
		
		System.out.println(set);
	}

}
