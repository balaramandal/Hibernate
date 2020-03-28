package corepractice;

import java.util.HashMap;

public final class Balaram {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Aa", 1);
		map.put("BB", 2);
		System.out.println(map.put("Cc", 3));
		map.entrySet();
	}

}
