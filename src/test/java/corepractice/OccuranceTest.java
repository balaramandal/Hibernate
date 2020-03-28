package corepractice;

import java.util.HashMap;

public class OccuranceTest {
	public static void main(String args[]){
		String s1 = "balarmm";
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<s1.length();i++){
			char ch = s1.charAt(i);
			int val = 1;
			if(map.get(ch)!=null){
				val = map.get(s1.charAt(i))+1;
				map.put(s1.charAt(i), val);
			}else{
				map.put(s1.charAt(i), val);
			}
		}
		
		System.out.println(map);
		HashMap<Character, Integer> hm = new HashMap<>();
		
		int val=0;
		for(Character c1: map.keySet()){
			System.out.println(c1);
			int currentVal = map.get(c1);
			if(currentVal>=val){
				val = currentVal;
				hm.put(c1, val);
			}
		}
		System.out.println(hm);
	}
}
