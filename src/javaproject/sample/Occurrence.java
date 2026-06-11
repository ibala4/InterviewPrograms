package javaproject.sample;

import java.util.HashMap;
import java.util.Map;

public class Occurrence {
	public static void main(String[] args) {
		String str = "Banana";
		Map<Character, Integer> charCountMap = new HashMap<>();
		for(char c : str.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		}
		System.out.println("Character occurrences in the string: " + charCountMap);
	}

}
