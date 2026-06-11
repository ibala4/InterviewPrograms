package javaproject.sample;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArrays {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5,1};
		Set<Integer> set = new HashSet<>();
		Boolean flag = false;
		for(int getarray:arr) {
			if(!set.add(getarray)) {
				System.out.println("Duplicate element is: " + getarray);
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("No duplicate element found in the array");
		}
	}
		
}
