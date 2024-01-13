package com.Boot_Camp_Questions_Examples;

import java.util.HashMap;
import java.util.TreeMap;

public class Hashmap_Treemap {

	public static void main(String[] args) {
		HashMap <Integer, String> hashmap = new HashMap <>();
		//adding some entries by using putmethod(first pass key and then value
		hashmap.put(5000, "Shahjan");
		hashmap.put(4000, "Ahmad");
		hashmap.put(6000, "Mashrufa");
		hashmap.put(7000, "Roly");
		hashmap.put(3000, "Shiwlee");
		
		System.out.println("Hasmap:"+hashmap);
		
		TreeMap <Integer, String> treemap = new TreeMap<>();
		treemap.put(5000, "Shahjan");
		treemap.put(4000, "Ahmad");
		treemap.put(6000, "Mashrufa");
		treemap.put(7000, "Roly");
		treemap.put(3000, "Shiwlee");
		System.out.println("Treemap:"+ treemap);
		treemap.forEach((k,v) -> System.out.println("Key = "+ k +" Value = "+v));
		System.out.println(treemap.lastKey());
		System.out.println(treemap.firstKey());
	}
}
